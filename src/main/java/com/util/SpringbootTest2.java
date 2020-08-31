package com.util;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这是一个springboot启动类
//默认扫描com.util下的所有包

//默认扫描dao层(如果是把启动类放在com下，就不用写这一行注释)
//指定basePackages，扫描mybatis Mapper接口类..;
/*
@MapperScan(basePackages = {"com.dao","com.service"})
//如果是把启动类放在com下，就默认扫描com包下的所有注释，不需要写(scanBasePackages = "com")
@SpringBootApplication(scanBasePackages = "com")
public class SpringbootTest2 {
    public static void main(String[] args) {

        SpringApplication.run(SpringbootTest2.class,args);

    }
}
*/
