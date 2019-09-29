package com.aaa.zhou.springcloud.mapper;

import com.aaa.zhou.springcloud.model.User;

import java.util.List;

/**
 * @author 766542
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();
}