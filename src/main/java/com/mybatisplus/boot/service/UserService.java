package com.mybatisplus.boot.service;

import java.util.List;

import com.mybatisplus.boot.model.User;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface UserService extends ISuperService<User> {
	public List<User> selectAll();

}