package com.aaa.zhou.springcloud.service;

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
 * @Date: 2019/9/29
 * @Time: 15:57
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAllUesrs() {
        return userMapper.selectAll();
    }
}
