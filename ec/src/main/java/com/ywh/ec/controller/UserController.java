package com.ywh.ec.controller;

import com.ywh.ec.domain.User;
import com.ywh.ec.service.UserService;
import com.ywh.ec.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {
    @Autowired
    public UserService userService;

    /**
     * 登录接口
     * @param user
     * @return
     */
    @PostMapping("login")
    public JsonData login(@RequestBody User user){ // @RequestBody注解对Json格式数据自动进行解析
        String token = userService.login(user.getUsername(),user.getPwd());
        return token == null ? JsonData.buildError("Incorrect account password!") : JsonData.buildSuccess(token);
    }

    /**
     * 显示用户列表
     * @return
     */
    @GetMapping("list_user")
    public JsonData listUser(){
//        System.out.println("2222");
        return JsonData.buildSuccess(userService.listUser());
    }
}
