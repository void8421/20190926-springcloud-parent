package com.aaa.zhou.springcloud;

import com.aaa.zhou.ribbon.rule.RibbonRuleMine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/28
 * @Time: 21:02
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "USER-PROVIDER", configuration = RibbonRuleMine.class)
public class ApplicationRun6082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class, args);
    }
}
