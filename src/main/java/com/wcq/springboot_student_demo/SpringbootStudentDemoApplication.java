package com.wcq.springboot_student_demo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wcq")
@MapperScan("com.wcq.dao")
public class SpringbootStudentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudentDemoApplication.class, args);
    }

}
