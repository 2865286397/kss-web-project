package com.teno.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;




/**
 * Description: 文章分类
 * Author: TenNo
 * Version: 1.0
 * Create Date Time: 2021 2021/11/11 20:07
 * Update Date Time:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("kss_blog_category")
@EqualsAndHashCode(callSuper = true)
public class BlogCategory extends BaseEntity {
    @TableId(type = IdType.AUTO)
    private Integer id; //分类ID
    private String  categoryTitle; //分类标题
    private String  status; //发布0未发1发布 用于控制前台的显示问题
    private Integer sorted; //排序字段，控制前台显示的顺序，用升序
}
