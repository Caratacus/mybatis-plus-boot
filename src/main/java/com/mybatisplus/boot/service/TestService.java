package com.mybatisplus.boot.service;


import java.util.List;

import com.baomidou.framework.service.IService;
import com.baomidou.mybatisplus.plugins.Page;
import com.mybatisplus.boot.model.Test;

/**
 *
 * User 表数据服务层接口
 *
 */
    public interface TestService extends IService<Test> {
	public List<Test> selectAll();

    List<Test> selectTest();
    Page<Test> selectTest1();
    List<Test> selectTest2();
}