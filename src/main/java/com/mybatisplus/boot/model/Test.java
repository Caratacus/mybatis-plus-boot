package com.mybatisplus.boot.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 *
 * 用户表
 *
 */
public class Test extends Model<User> {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 名称 */
	@TableId(type = IdType.AUTO)
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

	@Override
	protected Serializable getPrimaryKey() {
		return id;
	}
}
