package com.daofeng.system.service.impl;

import com.daofeng.system.entity.UserEntity;
import com.daofeng.system.entity.dto.LoginDto;
import com.daofeng.system.mapper.UserMapper;
import com.daofeng.system.result.Result;
import com.daofeng.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.service.impl
 * @Date 2024/4/23 14:00
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result<UserEntity> login(LoginDto loginDto) {
        String loginName = loginDto.getLoginName();
        String password = loginDto.getPassword();

        UserEntity user = userMapper.getUserByName(loginName);

        if (user == null) {
            return Result.error("用户不存在");
        }
        if (!user.getPassword().equals(password)) {
            return Result.error("密码错误");
        }
        return Result.success(user);
    }

    @Override
    public UserEntity getUserById(Integer loginUserId) {
        return null;
    }

    @Override
    public boolean updatePassword(Integer loginUserId, String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public boolean updateUserName(Integer loginUserId, String LoginName, String NickName) {
        return false;
    }
}