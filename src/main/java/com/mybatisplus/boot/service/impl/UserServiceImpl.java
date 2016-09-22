package com.mybatisplus.boot.service.impl;

import java.util.List;

import com.mybatisplus.boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatisplus.boot.model.User;
import com.mybatisplus.boot.service.UserService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

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

}