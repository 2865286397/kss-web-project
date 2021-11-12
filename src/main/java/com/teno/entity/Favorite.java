package com.teno.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * Description: 收藏
 * Author: TenNo
 * Version: 1.0
 * Create Date Time: 2021 2021/11/11 20:07
 * Update Date Time:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("kss_favorite")
public class Favorite extends BaseEntity{
    @TableId(type = IdType.AUTO)
    private Integer id; // 收藏夹的ID
    private String  title; //收藏夹的标题
    private String  link; //收藏夹的连接
    private String  status; //发布0未发布 1发布
    private String  userId; //添加用户

}
