package com.mybatisplus.boot.utils;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.ConfigGenerator;

public class MybatisPlusGenerator {
	public static void main(String[] args) {
        ConfigGenerator cg = new ConfigGenerator();

        // 配置 MySQL 连接
        cg.setDbDriverName("com.mysql.jdbc.Driver");
        cg.setDbUser("root");
        cg.setDbPassword("521");
        cg.setDbUrl("jdbc:mysql://127.0.0.1/mybatis-plus?characterEncoding=utf8");
        cg.setTableNames(new String[]{"user"});
        // 配置包名
        cg.setEntityPackage("com.app.boot.base");
        cg.setMapperPackage("com.app.boot.mapper");
        cg.setServicePackage("com.app.boot.service");
        cg.setXmlPackage("com.app.boot.sql");
        cg.setDbPrefix(true);
        cg.setServiceImplPackage("com.app.bootorg.service.impl");
        cg.setIdType(IdType.AUTO);
        // 配置保存路径
        cg.setSaveDir("/home/springboot");

        // 其他参数请根据上面的参数说明自行配置，当所有配置完善后，运行AutoGenerator.run()方法生成Code
        // 生成代码
        AutoGenerator.run(cg);
    }
}
