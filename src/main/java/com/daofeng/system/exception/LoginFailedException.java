package com.daofeng.system.exception;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.exception
 * @Date 2024/4/23 18:39
 * @Author 瑾。
 * @Version 1.0
 * @Description 登录失败
 */
public class LoginFailedException extends BaseException{
    public LoginFailedException(String msg){
        super(msg);
    }
}