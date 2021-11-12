package com.teno.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * Description: 用户
 * Author: TenNo
 * Version: 1.0
 * Create Date Time: 2021 2021/11/11 20:07
 * Update Date Time:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("kss_user")
public class User extends BaseEntity{
    @TableId(type = IdType.AUTO)
    private Integer id;  //用户id
    private String nickname;  //用户昵称
    private String password;  //用户密码
    private String telephone;  //用户手机（用于登录）
    private String email;  //用户邮箱
    private String avatar;  //用户头像的地址
    private String sign;  //用户签名
    private Integer active;  //1激活 0未激活
    private String role;  //admin是超级管理员 nornal是普通用户

}
