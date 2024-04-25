package com.daofeng.system.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity
 * @Date 2024/4/23 11:50
 * @Author 瑾。
 * @Version 1.0
 * @Description 用户实体类
 */
@Data
@Builder
public class UserEntity {
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 登录名
     */
    private String loginName;
    /**
     * 密码
     */
    private String password;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 注册时间
     */
    private String registerTime;
    /**
     * 邮箱
     */
    private String userEmil;
    /**
     * 头像
     */
    private String avatarUrl;
    /**
     * 微信
     */
    private String wechat;
}