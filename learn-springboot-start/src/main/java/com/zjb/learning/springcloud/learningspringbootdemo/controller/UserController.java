package com.zjb.learning.springcloud.learningspringbootdemo.controller;

import com.google.gson.Gson;
import com.zjb.learning.springcloud.learningspringbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjb
 * @date 2017/10/29.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public String findOneById(@PathVariable Integer id){
        Gson gson = new Gson();
        return gson.toJson(userService.findOneById(id));
    }

}
