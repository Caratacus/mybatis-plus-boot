package com.mybatisplus.boot.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 *
 * 用户表
 *
 */
@TableName(resultMap = "userMap")
public class User implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 名称 */
	@TableId
	private Long id;
	/** 名称 */
	private String name;

	/** 年龄 */
	private Integer age;

	/** 测试下划线字段命名类型 */
	@TableField(value = "test_type")
	private Integer testType;

	/**  */
	private Long role;

	/**  */
	private String phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getTestType() {
		return testType;
	}

	public void setTestType(Integer testType) {
		this.testType = testType;
	}

	public Long getRole() {
		return role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
