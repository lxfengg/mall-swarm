package com.liuxiaofeng.mall.exercise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liuxiaofeng.mall.exercise.dao")
public class MallExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallExerciseApplication.class, args);
    }

}
