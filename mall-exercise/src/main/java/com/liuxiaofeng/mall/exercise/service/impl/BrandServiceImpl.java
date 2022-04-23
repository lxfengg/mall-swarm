package com.liuxiaofeng.mall.exercise.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuxiaofeng.mall.exercise.dao.BrandMapper;
import com.liuxiaofeng.mall.exercise.entity.dto.Brand;
import com.liuxiaofeng.mall.exercise.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * @author Liu&Feng
 * @date 2022/4/23 23:48
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
}
