package com.rexou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author qiushi 2019/9/7
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/testUpload")
    public String testUpload(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request) throws Exception {

        //获取到上传的文件名
        String fname = multipartFile.getOriginalFilename();

        //获取到服务器端uploads文件夹的真实路径
        String fpath = request.getSession().getServletContext().getRealPath("uploads");
        File nFile = new File(fpath + "/" + fname);
        multipartFile.transferTo(nFile);

        return "success";
    }
}
