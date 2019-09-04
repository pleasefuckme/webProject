package com.baidu.controller;

import com.baidu.bean.meterreading;
import com.baidu.service.MeterReadingService;
import jxl.Sheet;
import jxl.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-27-15:06
 */
@Controller
public class ImportServlet  {
//    @Autowired
//    private meterreading meterreading;

    @Autowired
    private MeterReadingService meterReadingService;

    @RequestMapping("/Import")
    @ResponseBody
    public String Import(@RequestParam("path") String path) {
        try {
            ArrayList<meterreading> list = new ArrayList<>();
            Workbook rwb = Workbook.getWorkbook(new File(path));
            //或者rwb.getSheet(0)
            Sheet rs = rwb.getSheet("Sheet1");
            //得到所有的列
            int clos = rs.getColumns();
            //得到所有的行
            int rows = rs.getRows();
            for (int i = 1; i < rows; i++) {
                int j=0;
//                for (int j = 0; j < clos; j++) {
                    //第一个是列数，第二个是行数
                    String meternumber = rs.getCell(j++, i).getContents();//默认最左边编号也算一列 所以这里得j++
                    String electricmeternumber = rs.getCell(j++, i).getContents();
                String meterreadingstarttime = rs.getCell(j++, i).getContents();
                String meterreadingendtime = rs.getCell(j++, i).getContents();
                String nowmeternumber = rs.getCell(j++, i).getContents();
                String lastmeternumber = rs.getCell(j++, i).getContents();
                meterreading meterreading = new meterreading();
                meterreading.setMeternumber(meternumber);
                meterreading.setElectricmeternumber(Integer.parseInt(electricmeternumber));
                meterreading.setMeterreadingstarttime(meterreadingstarttime);
                meterreading.setMeterreadingendtime(meterreadingendtime);
                    meterreading.setNowmeternumber(Float.parseFloat(nowmeternumber));
                    meterreading.setLastmeternumber(Float.parseFloat(lastmeternumber));
                    meterreading.setCreater("tom");
                    meterreading.setCreateway("over");
                    meterreading.setMeterreadingway("over");
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String s = dateTimeFormatter.format(LocalDateTime.now());
                    meterreading.setCreatetime(s);
                list.add(meterreading);
//                }
            }
            meterReadingService.upload(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "1";
    }
}
