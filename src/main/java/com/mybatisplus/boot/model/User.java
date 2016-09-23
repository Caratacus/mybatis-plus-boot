package com.mybatisplus.boot.model;

import com.app.framework.entity.AutoPrimaryKey;
import com.app.mybatisplus.annotations.Column;

import java.io.Serializable;

/**
 *
 * 用户表
 *
 */
public class User extends AutoPrimaryKey implements Serializable {

	@Column(exist = false)
	private static final long serialVersionUID = 1L;

	/** 名称 */
	private String name;

	/** 年龄 */
	private Integer age;

	/** 测试下划线字段命名类型 */
	@Column(value = "test_type")
	private Integer testType;

	/**  */
	private Long role;

	/**  */
	private String phone;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getTestType() {
		return this.testType;
	}

	public void setTestType(Integer testType) {
		this.testType = testType;
	}

	public Long getRole() {
		return this.role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
