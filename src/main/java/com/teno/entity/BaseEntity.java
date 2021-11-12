package com.teno.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Author: TenNo
 * Version: 1.0
 * Create Date Time: 2021 2021/11/11 21:24
 * Update Date Time:
 *
 * @see
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseEntity implements Serializable {
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;  //创建时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;  //更新时间
}
