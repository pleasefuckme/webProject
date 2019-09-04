package com.baidu.utils;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

/**
 * @Description: 工具类实现文件的上传,下载,Excel的导入与导出
 * @Author SuperStar
 * @Create 2019-08-31-21:55
 */
public class Utils {
    /**
     * 文件上传成功则返回文件路径可直接作为Excel文件解析的参数
     * tips(前端直接上传并解析效果更佳!!!哈哈哈)
     *
     * @param request  请求
     * @param response 响应
     * @param filetype 文件后缀
     * @param savepath 保存路径
     * @return 字符串提示结果
     * @throws Exception
     */
    public static String upLoad(HttpServletRequest request, HttpServletResponse response, String filetype, String savepath) throws Exception {
        PrintWriter out = response.getWriter();
        //判断表单是否有Multipart
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart) {
            ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
            List<FileItem> items = upload.parseRequest(request);
            Iterator<FileItem> iter = items.iterator();
            while (iter.hasNext()) {
                FileItem item = iter.next();
                if (!item.isFormField()) {
                    // getName()是获取 文件名
                    String fileName = item.getName();
                    //获取文件格式
                    String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
                    if (ext.equals(filetype)) {
//                        String replace = UUID.randomUUID().toString().replace("-", "");
//                        fileName = replace + "_" + fileName;
                        item.write(new File(savepath, fileName));
                        return savepath + fileName;
                    } else {
                        return "文件格式不符";
                    }
                }
            }
            return "没有符合要求的文件";
        } else {
            return "提交的表单中无文件";
        }
    }

    /**
     * 文件下载将文件绑定至response
     *
     * @param response 响应
     * @param path     文件路径
     * @return 绑定文件的response
     * @throws IOException
     */
    public static HttpServletResponse downLoad(HttpServletResponse response, String path) throws IOException {
        // path是指欲下载的文件的路径。
        File file = new File(path);
        // 取得文件名。
        String filename = file.getName();
        // 以流的形式下载文件。
        InputStream fis = new BufferedInputStream(new FileInputStream(path));
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        // 清空response
        response.reset();
        // 设置response的Header
        response.addHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes()));
        response.addHeader("Content-Length", "" + file.length());
        OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
        response.setContentType("application/octet-stream");
        toClient.write(buffer);
        toClient.flush();
        toClient.close();
        return response;
    }

    /**
     * 解析Excel并批量新增至数据库
     * @param path 文件路径
     * @param connection 连接
     * @param sql 插入的SQL语句
     * @throws SQLException
     * @throws IOException
     * @throws BiffException
     */
    public static void excelToDB(String path, Connection connection, String sql) throws SQLException, IOException, BiffException {
        Workbook rwb = Workbook.getWorkbook(new File(path));
        //或者rwb.getSheet(0)
        Sheet rs = rwb.getSheet("Sheet1");
        //得到所有的列
        int clos = rs.getColumns();
        //得到所有的行
        int rows = rs.getRows();
        connection.setAutoCommit(false);
        PreparedStatement statement = connection.prepareStatement(sql);
        try {
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < clos; j++) {
                    Cell cell = rs.getCell(j, i);
                    String contents = cell.getContents();
                    statement.setObject(j + 1, contents);
                }
                statement.executeUpdate();
            }
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 传入查询的结果集和文件名及路径创建Excel
     *
     * @param resultSet 查询的结果集
     * @param path      文件保存路径
     * @param fileName  文件名
     * @throws SQLException
     * @throws IOException
     */
    public static void resultsetToExcel(ResultSet resultSet, String path, String fileName) throws SQLException, IOException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] coloumItems = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            String columnLabe = metaData.getColumnLabel(i+1);
            coloumItems[i] = columnLabe;
        }

        FileOutputStream fileOutputStream = new FileOutputStream(path + fileName + ".xls");
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        // 写表格的列名
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = null;
        for (int i = 0; i < coloumItems.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(coloumItems[i]);
        }
        //写入具体数据
        int flag = 1;
        while (resultSet.next()) {
            row = sheet.createRow(flag);
            for (int i = 1; i <= columnCount; i++) {
                cell = row.createCell(i - 1);
                Object obj = resultSet.getObject(i);
                cell.setCellValue(obj + "");
            }
            flag++;
        }
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }

    /**
     * 获取数据库连接
     * @param path 配置文件名称带上路径(不写默认项目根目录下)
     * @return connection
     */
    public static Connection getConnection(String path){
        Connection connection= null;
        try {
            String url,driver,user,password;
            Properties properties = new Properties();
            InputStream in = Utils.class.getClassLoader().getResourceAsStream(path);
            properties.load(in);
            url=properties.getProperty("url");
            driver=properties.getProperty("driver");
            user=properties.getProperty("user");
            password=properties.getProperty("password");
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    /**
     *  关闭数据库连接方法
     * @param connection
     * @param statement
     * @param resultSet
     */
    public static void CloseAll(Connection connection, Statement statement, ResultSet resultSet){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

