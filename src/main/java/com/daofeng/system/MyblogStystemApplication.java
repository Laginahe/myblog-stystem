package com.daofeng.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.daofeng.system.mapper")
public class MyblogStystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyblogStystemApplication.class, args);
    }
}
