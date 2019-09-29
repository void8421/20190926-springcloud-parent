package com.aaa.zhou.springcloud.controller;

import com.aaa.zhou.springcloud.model.User;
import com.aaa.zhou.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/26
 * @Time: 20:21
 */
@RestController
public class UserController {

    @Autowired
    public IUserService userService;

    @RequestMapping("/userall")
    public List<User> getAllUsers() {
        System.out.println(8083);
        return userService.getAllUsers();
    }
}
