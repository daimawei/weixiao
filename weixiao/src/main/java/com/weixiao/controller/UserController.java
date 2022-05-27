package com.weixiao.controller;


import com.sun.org.apache.xpath.internal.objects.XObject;
import com.weixiao.Service.UserService;
import com.weixiao.User;
import com.weixiao.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//控制器
@Controller
//请求映射地址
@RequestMapping("/user")
public class UserController {



    //自动配装
    @Autowired
    private UserService userService;
    //自动配装
    @Autowired
    private UserMapper userMapper;

    //请求映射地址
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    //请求映射地址
    @RequestMapping("/list")

    //将对象指定格式转化为指定的格式
    @ResponseBody
    public String getUser(){
        List<User> users = userService.findAllUser();
        System.out.println(users);
        if (users == null){
            return "未查询到数据";
        }
        return users.toString();
    }

    //请求映射地址
    @RequestMapping("/add")
    //将对象指定格式转化为指定的格式
    @ResponseBody
    public Object addUser(){
        User user = new User();
        user.setType("学生");
        user.setName("甲");
        user.setSchool("修真院");
        return user;
    }

}
