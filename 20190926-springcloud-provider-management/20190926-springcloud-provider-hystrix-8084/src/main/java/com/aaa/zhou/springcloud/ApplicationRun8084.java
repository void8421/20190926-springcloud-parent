package com.aaa.zhou.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 *      @EnableCircuitBreaker:开启断容器
 * @Date: 2019/9/29
 * @Time: 15:49
 */
@SpringBootApplication
@MapperScan("com.aaa.zhou.springcloud.mapper")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ApplicationRun8084 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class, args);
    }
}
