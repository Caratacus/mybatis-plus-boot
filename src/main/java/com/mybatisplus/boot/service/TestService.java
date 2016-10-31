package com.mybatisplus.boot.service;


import com.baomidou.framework.service.IService;
import com.mybatisplus.boot.model.Test;

import java.util.List;

/**
 *
 * User 表数据服务层接口
 *
 */
    public interface TestService extends IService<Test> {
	public List<Test> selectAll();

    List<Test> selectTest();
    List<Test> selectTest1();
    List<Test> selectTest2();
}