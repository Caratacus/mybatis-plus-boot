package com.mybatisplus.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mybatisplus.boot.model.User;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends BaseMapper<User> {
	public List<User> selectAll();

	@Select("select * from user limit 0")
	List<User> selectTest();

	@Select("select * from user limit 1")
	List<User> selectTest1(EntityWrapper e);

	@Select("select * from user limit 2")
	List<User> selectTest2(User user);
}