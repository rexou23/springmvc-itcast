package com.rexou.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

/**
 * @author qiushi 2019/9/7
 */

@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/upload1")
    public String upload1(@RequestParam("file1") MultipartFile multipartFile, HttpSession session) throws Exception{

        //得到上传的文件名
        String filename = multipartFile.getOriginalFilename();
        //得到图片服务器的存储路径（当前服务器为本机）
        String realPath = session.getServletContext().getRealPath("/uploads/");

        File file = new File(realPath);
        if(!file.exists()){
            file.mkdir();
        }

        InputStream inputStream = multipartFile.getInputStream();

        FileOutputStream outputStream = new FileOutputStream(realPath + filename);

        int  i = 0;
        while((i= inputStream.read())!= -1 ){
            outputStream.write(i);
        }

        outputStream.close();
        inputStream.close();

        return "success";
    }


    @RequestMapping("/upload2")
    public String upload2(@RequestParam("file2") MultipartFile multipartFile, HttpServletRequest request) throws Exception{

        String filename = multipartFile.getOriginalFilename();

        String realPath = request.getSession().getServletContext().getRealPath("/uploads/");

        File file = new File(realPath);
        if(!file.exists()){
            file.mkdir();
        }

        multipartFile.transferTo(new File(realPath + filename));


        return "success";
    }

    @RequestMapping("/upload3")
    public String upload3(HttpServletRequest request) throws Exception{

        //上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");

        //判断路径是否存在
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }

        //解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        //解析request
        List<FileItem> items = upload.parseRequest(request);
        //遍历
        for (FileItem item : items) {
            //进行判断，当前item对象是否是上传文件项
            if(item.isFormField()){
                //说明普通表单项
            }else{
                //说明上传文件项
                //获取上传文件的名称
                String filename = item.getName();
                //把文件名设置唯一值
                String uuidStr = UUID.randomUUID().toString().replace("-", "");
                filename = uuidStr + "_" + filename;
                //完成文件上传
                item.write(new File(path,filename));
                //删除临时文件 上传大于10kb时会产生临时文件 小于则直接在内存中
                item.delete();

            }

        }

        return "success";
    }


    @RequestMapping("/upload4")
    public String upload4(@RequestParam("file4") MultipartFile multipartFile) throws Exception{

        //定义图片服务器路径
        String host = "http://localhost:8090/picserver/uploads/";

        //获取上传文件名称
        String filename = multipartFile.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-","");
        filename = uuid + "_" + filename;

        //创建客户端对象
        Client client = Client.create();
        //连接图片服务器
        WebResource resource = client.resource(host + filename);
        //上传文件
        resource.put(multipartFile.getBytes());

        return "success";
    }

}
