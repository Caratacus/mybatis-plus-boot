package com.mybatisplus.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.framework.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mybatisplus.boot.mapper.UserMapper;
import com.mybatisplus.boot.model.User;
import com.mybatisplus.boot.service.UserService;

/**
 *
 * BaseUser 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
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
    @Override
    public List<User> selectTest1() {
        return userMapper.selectTest1(new EntityWrapper<User>());
    }
    @Override
    public List<User> selectTest2() {
        return userMapper.selectTest2(new User());
    }

}