package com.aaa.zhou.springcloud.controller;

import com.aaa.zhou.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/28
 * @Time: 21:05
 */
@RestController
public class UserController {

    private static final String URL = "http://USER-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/userall")
    public List<User> selectAllUsers() {
        return restTemplate.getForObject(URL + "/userall", List.class);
    }

    @RequestMapping("/balanceUserAll")
    public List<User> balanceUserAll() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("user-provider");
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        return restTemplate.getForObject("http://" + host + port + "/userall", List.class);
    }
}
