package com.rexou.controller;

import com.rexou.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiushi 2019/9/6
 */

@Controller
@RequestMapping("param")
public class ParamController {


    @RequestMapping("/add")
    public String addUser(User user){
        System.out.println(user);
        return "success";
    }
}
