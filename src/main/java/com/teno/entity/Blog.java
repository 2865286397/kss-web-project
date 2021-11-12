package com.teno.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * Description: 文章
 * Author: TenNo
 * Version: 1.0
 * Create Date Time: 2021 2021/11/11 20:07
 * Update Date Time:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("kss_blog")
public class Blog extends BaseEntity{
    @TableId(type = IdType.AUTO)
    private Integer id; //内容ID
    private String  title; //标题
    private String  content; //内容
    private Integer  categoryId; //分类ID
    private String  categoryTitle; //分类的标题
    private String  img; //封面地址（oss文件存储）
    private Integer  userId; //用户ID
    private String  status; //控制内容是否在前台进行展示 0 不展示 1展示
}
