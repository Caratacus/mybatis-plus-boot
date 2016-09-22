package com.mybatisplus.boot.mapper;

import java.util.List;

import com.mybatisplus.boot.model.User;
import com.baomidou.mybatisplus.mapper.AutoMapper;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends AutoMapper<User> {
    public List<User> selectAll();

}