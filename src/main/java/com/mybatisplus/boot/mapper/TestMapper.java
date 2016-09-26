package com.mybatisplus.boot.mapper;

import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mybatisplus.boot.model.Test;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * User 表数据库控制层接口
 */
public interface TestMapper extends AutoMapper<Test> {
	public List<Test> selectAll();

	@Select("select * from test limit 0")
	List<Test> selectTest();

	@Select("select * from test limit 1")
	List<Test> selectTest1(EntityWrapper e);

	@Select("select * from test limit 2")
	List<Test> selectTest2(Test user);
}