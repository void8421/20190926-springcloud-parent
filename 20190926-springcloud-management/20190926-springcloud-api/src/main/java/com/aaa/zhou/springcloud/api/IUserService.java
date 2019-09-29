package com.aaa.zhou.springcloud.api;

import com.aaa.zhou.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/29
 * @Time: 15:16
 */
@FeignClient(value = "USER-PROVIDER")
public interface IUserService {

    /**
     * @method_name selectAllUsers
     * @author zhoulinhao
     * @description
     *      基本类型参数使用@RequestParam   List<User> selectAllUsers(@RequestParam Integer id);
     *      包装类型参数使用@RequestBody    List<User> selectAllUsers(@RequestBody User user);
     *      传递的参数最多只能一个，需要传递多个参数是需要封装
     * @param []
     * @date 2019/9/29
     * @time 15:26
     * @return java.util.List<com.aaa.zhou.springcloud.model.User>
    **/
    @RequestMapping("/userall")
    List<User> selectAllUsers();
}
