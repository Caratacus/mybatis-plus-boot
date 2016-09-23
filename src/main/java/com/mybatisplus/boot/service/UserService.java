package com.mybatisplus.boot.service;

import com.app.framework.service.ISuperService;
import com.app.mybatisplus.plugins.Page;
import com.mybatisplus.boot.model.User;

import java.util.List;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface UserService extends ISuperService<User> {
	public List<User> selectAll();

    List<User> selectTest();
}