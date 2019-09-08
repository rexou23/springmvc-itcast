package com.rexou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author qiushi 2019/9/6
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("123123123");
        return "success";
    }

    @RequestMapping("/hello2")
    public void sayHello2(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        response.getWriter().print("123123");

//        request.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(request,response);
    }

}
