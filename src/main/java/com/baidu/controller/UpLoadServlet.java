package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Description:
 * @Author SuperStar
 * @Create 2019-08-26-22:24
 */

@Controller
public class UpLoadServlet {

    @RequestMapping("/UpLoader")
    @ResponseBody
    public String upload(@RequestParam("upload") MultipartFile upload) {
        String path = "D:\\IDEAProject\\webProject\\";
//      创建File对象，一会向该路径下上传文件
        File file = new File(path);
//      判断路径是否存在，如果不存在，创建该路径
        if (!file.exists()) {
            file.mkdirs();
        }
//      获取到上传文件的名称
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
//      把文件的名称唯一化
        filename = uuid + "_" + filename;
//      上传文件
        try {
            upload.transferTo(new File(file, filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path + filename;
    }
}
