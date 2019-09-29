package com.aaa.zhou.springcloud.controller;

import com.aaa.zhou.springcloud.model.User;
import com.aaa.zhou.springcloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/29
 * @Time: 15:54
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userall")
//    @HystrixCommand(fallbackMethod = "selectAllUsersFallBack")
    public List<User> selectAllUsers() throws Exception {
        List<User> userList = userService.selectAllUesrs();
        if (userList.size() > 0) {
            throw new Exception("------熔断测试------");
        }
        return userList;
    }

    /*public List<User> selectAllUsersFallBack() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(10000);
        user.setUsername("------熔断测试-----用户名");
        userList.add(user);
        return userList;
    }*/
}
