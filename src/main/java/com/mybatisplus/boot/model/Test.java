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
public class Test implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 名称 */
	@TableId
	private Long id;
	/** 名称 */
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
