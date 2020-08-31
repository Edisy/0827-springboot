package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Edo
 */ //这是一个springboot启动类
//默认扫描com下的所有包
    //整合mybatis
@MapperScan(basePackages = "com.dao")
@SpringBootApplication
public class SpringbootTest {
    public static void main(String[] args) {

        SpringApplication.run(SpringbootTest.class,args);


    }
}
