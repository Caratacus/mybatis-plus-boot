package com.mybatisplus.boot.service;


import java.util.List;

import com.baomidou.framework.service.ISuperService;
import com.mybatisplus.boot.model.User;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface UserService extends ISuperService<User> {
	public List<User> selectAll();

    List<User> selectTest();
    List<User> selectTest1();
    List<User> selectTest2();
}