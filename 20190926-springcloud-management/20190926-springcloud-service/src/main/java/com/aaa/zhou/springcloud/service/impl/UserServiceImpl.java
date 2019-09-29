package com.aaa.zhou.springcloud.service.impl;

import com.aaa.zhou.springcloud.service.IUserService;
import com.aaa.zhou.springcloud.mapper.UserMapper;
import com.aaa.zhou.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhoulinhao
 * @Description:
 * @Date: 2019/9/26
 * @Time: 20:23
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.selectAll();
    }
}
