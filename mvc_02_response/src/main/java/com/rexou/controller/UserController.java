package com.rexou.controller;

import com.rexou.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author qiushi 2019/9/7
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(){
        return "success";
    }


    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception{

//        request.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(request,response);

//        response.sendRedirect(request.getContextPath() + "/index.jsp");

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("你好");
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public User testAjax(@RequestBody User user){
        System.out.println(user);
        user.setPassword("321321");
        user.setAge(30);
        return user;
    }
}
