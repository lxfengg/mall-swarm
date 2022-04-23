package com.liuxiaofeng.mall.exercise;

import com.liuxiaofeng.mall.exercise.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallExerciseApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {}

    @Test
    public void test() {
        System.out.println(brandService.list());
        System.out.println(brandService.count());
    }
}
