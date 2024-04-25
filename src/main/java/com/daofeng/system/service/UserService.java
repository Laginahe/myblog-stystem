package com.daofeng.system.service;

import com.daofeng.system.entity.UserEntity;
import com.daofeng.system.entity.dto.LoginDto;
import com.daofeng.system.result.Result;

public interface UserService {
    /**
     * 用户登录
     * @param loginDto
     * @return
     */
    Result<UserEntity> login(LoginDto loginDto);

    UserEntity getUserById(Integer loginUserId);

    boolean updatePassword(Integer loginUserId, String oldPassword, String newPassword);

    boolean updateUserName(Integer loginUserId, String LoginName, String NickName);
}
