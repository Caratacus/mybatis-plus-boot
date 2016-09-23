package com.mybatisplus.boot.mapper;

import com.app.mybatisplus.mapper.AutoMapper;
import com.mybatisplus.boot.model.User;

import java.util.List;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends AutoMapper<User> {
    public List<User> selectAll();

}