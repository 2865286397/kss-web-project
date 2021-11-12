package com.teno.service.user;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.teno.entity.User;
import com.teno.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author: TenNo
 * Version: 1.0
 * Create Date Time: 2021 2021/11/11 20:42
 * Update Date Time:
 *
 * @see
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
