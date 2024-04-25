package com.daofeng.system.entity.dto;

import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity.dto
 * @Date 2024/4/23 12:10
 * @Author 瑾。
 * @Version 1.0
 * @Description 接收登录json数据
 */
@Data
public class LoginDto {
    private String loginName;
    private String password;
}