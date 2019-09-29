package com.aaa.zhou.springcloud.controller;

import com.aaa.zhou.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/26
 * @Time: 20:40
 */
@RestController
public class UserController {

    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping("/userall")
    public List<User> getAllUsers() {
        return restTemplate.getForObject("http://localhost:8081/userall", List.class);
    }
}
