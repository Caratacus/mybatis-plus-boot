package com.mybatisplus.boot.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.SqlMapper;
import com.baomidou.mybatisplus.toolkit.TableInfo;
import com.baomidou.mybatisplus.toolkit.TableInfoHelper;
import com.mybatisplus.boot.model.Test;
import com.mybatisplus.boot.service.TestService;
import org.apache.ibatis.jdbc.SqlRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/test1")
	@Transactional
	public void test1() throws SQLException {
		/*List<Test> tests = new ArrayList<Test>();
		for (int i = 1; i <= 50; i++) {
			Test test = new Test();
			test.setId(Long.valueOf(i));
			test.setType(String.valueOf(i));
			tests.add(test);
		}
		testService.insertBatchSelective(tests, 5);
        List<Test> tests1 = testService.selectList(null);
        System.out.println(tests1);*/
        /*Connection test = TableInfoHelper.getTableInfo("test").getSqlSessionFactory().openSession().getConnection();
        SqlRunner sqlRunner = new SqlRunner(test);
        sqlRunner.insert("INSERT INTO `test` (`id`, `type`) VALUES ('2', '2')");
        List<Map<String, Object>> maps = sqlRunner.selectAll("select * from test", new Object[]{});
        System.out.println("maps="+maps);*/
        SqlMapper test = TableInfoHelper.getTableInfo("test").getSqlMapper();
        test.insert("INSERT INTO `test` (`id`, `type`) VALUES ('2', '2')");
        test.insert("11323423");
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
