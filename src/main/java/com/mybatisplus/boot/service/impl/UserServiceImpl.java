package com.mybatisplus.boot.service.impl;

import com.app.framework.service.impl.SuperServiceImpl;
import com.mybatisplus.boot.mapper.UserMapper;
import com.mybatisplus.boot.model.User;
import com.mybatisplus.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * BaseUser 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> selectTest() {
        return userMapper.selectTest();
    }

}