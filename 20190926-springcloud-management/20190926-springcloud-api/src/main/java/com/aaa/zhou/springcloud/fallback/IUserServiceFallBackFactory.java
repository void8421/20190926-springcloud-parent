package com.aaa.zhou.springcloud.fallback;

import com.aaa.zhou.springcloud.api.IUserService;
import com.aaa.zhou.springcloud.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/29
 * @Time: 18:42
 */
@Component
public class IUserServiceFallBackFactory implements FallbackFactory<IUserService> {

    @Override
    public IUserService create(Throwable throwable) {
        System.out.println("------熔断------FallbackFactory测试------");
        return new IUserService() {
            @Override
            public List<User> selectAllUsers() {
                System.out.println("------熔断------selectAllUsers测试------");
                return null;
            }
        };
    }
}
