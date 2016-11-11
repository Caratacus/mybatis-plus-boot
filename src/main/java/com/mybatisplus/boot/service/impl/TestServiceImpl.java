package com.mybatisplus.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.framework.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;
import com.mybatisplus.boot.mapper.TestMapper;
import com.mybatisplus.boot.model.Test;
import com.mybatisplus.boot.service.TestService;

/**
 *
 * BaseUser 表数据服务层接口实现类
 *
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> selectAll() {
        return testMapper.selectAll();
    }

    @Override
    public List<Test> selectTest() {
        return testMapper.selectList(null);
    }
    @Override
    public Page<Test> selectTest1() {
        Page<Test> testPage = new Page<Test>(1, 10);
        List<Test> testPage1 = testMapper.selectTest1(testPage);
        testPage.setRecords(testPage1);
        return testPage;
    }
    @Override
    public List<Test> selectTest2() {
        return testMapper.selectTest2(new Test());
    }

}