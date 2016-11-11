package com.mybatisplus.boot.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.mybatisplus.boot.model.Test;
import com.mybatisplus.boot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/test1")
	public void test1() throws SQLException {
		Page<Test> tests = testService.selectTest1();
		System.out.println(tests);
	}

	/**
	 * 分页
	 */
	@RequestMapping("/test2")
	public List<Test> selectPageUser() {
		return testService.selectList(null);
	}

	/**
	 * 分页
	 */
	@RequestMapping("/test3")
	public List<Test> selectPageUser3() {
		return testService.selectTest2();
	}

	/**
	 * 分页
	 */
	@RequestMapping("/test4")
	public List<Test> selectPageUser4() {
		return testService.selectTest2();
	}

	/**
	 * 分页
	 */
	@RequestMapping("/test5")
	public List<Test> selectPageUser5() {
		return testService.selectList(null);
	}

	/**
	 * 分页
	 */
	@RequestMapping("/test6")
	public Test selectPageUser6() {
		return testService.selectOne(new EntityWrapper<Test>());
	}
}
