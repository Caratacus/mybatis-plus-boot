package com.mybatisplus.boot.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mybatisplus.boot.model.Test;
import com.mybatisplus.boot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/test1")
	@Transactional
	public void test1() {
		List<Test> tests = new ArrayList<Test>();
		for (int i = 1; i <= 50; i++) {
			Test test = new Test();
			test.setId(Long.valueOf(i));
			test.setType(String.valueOf(i));
			tests.add(test);
		}
		testService.insertBatchSelective(tests, 5, true);
		System.out.println("1111");
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
		return testService.selectTest1();
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
