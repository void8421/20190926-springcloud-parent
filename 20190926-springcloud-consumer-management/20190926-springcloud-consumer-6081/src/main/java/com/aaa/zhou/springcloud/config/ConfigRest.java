package com.aaa.zhou.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/26
 * @Time: 20:42
 */
@SpringBootApplication
public class ConfigRest {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
