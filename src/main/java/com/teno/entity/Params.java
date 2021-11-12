package com.teno.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * Description: 网页参数
 * Author: TenNo
 * Version: 1.0
 * Create Date Time: 2021 2021/11/11 20:07
 * Update Date Time:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("kss_params")
public class Params extends BaseEntity{
    @TableId(type = IdType.AUTO)
    private Integer id; // 参数ID
    private String  logo; // 控制网站的logo
    private String  skin; // 网站换肤 black ，white
    private String  footer; // 底部信息

}
