package com.mybatisplus.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.mybatisplus.boot.model.Test;


/**
 * User 表数据库控制层接口
 */
public interface TestMapper extends BaseMapper<Test> {
	public List<Test> selectAll();

	@Select("select * from test limit 0")
	List<Test> selectTest();

	List<Test> selectTest1(Page page);

	@Select("select * from test limit 2")
	List<Test> selectTest2(Test user);
}