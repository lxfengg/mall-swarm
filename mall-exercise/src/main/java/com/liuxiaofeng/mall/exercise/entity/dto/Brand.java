package com.liuxiaofeng.mall.exercise.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Liu&Feng
 * @date 2022/4/23 23:43
 */
@Data
@TableName("pms_brand")
public class Brand extends Model<Brand> implements Serializable {

    @TableId
    private Long id;

    @TableField("name")
    private String name;

    @TableField("first_letter")
    private String firstLetter;

    @TableField("sort")
    private Integer sort;

    @TableField("factory_status")
    private Integer factoryStatus;

    @TableField("show_status")
    private Integer showStatus;

    @TableField("product_count")
    private Integer productCount;

    @TableField("product_comment_count")
    private Integer productCommentCount;

    @TableField("logo")
    private String logo;

    @TableField("big_pic")
    private String bigPic;

    @TableField("brand_story")
    private String brandStory;
}
