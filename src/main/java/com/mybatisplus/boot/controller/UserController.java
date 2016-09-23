package com.mybatisplus.boot.controller;

import com.mybatisplus.boot.model.User;
import com.mybatisplus.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/test1")
	public List<User> test1() {
		return userService.selectAll();
	}

	/**
	 * 分页
	 */
	@RequestMapping("/test2")
	public List<User> selectPageUser() {
		return userService.selectTest();
	}
}