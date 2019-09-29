package com.aaa.zhou.springcloud.service;

import com.aaa.zhou.springcloud.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/26
 * @Time: 20:22
 */
public interface IUserService {

    List<User> getAllUsers();
}
