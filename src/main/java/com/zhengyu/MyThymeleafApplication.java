package com.zhengyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhengyu.dao")
public class MyThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyThymeleafApplication.class, args);
    }

}
