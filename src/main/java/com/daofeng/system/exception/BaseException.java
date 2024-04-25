package com.daofeng.system.exception;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.exeception
 * @Date 2024/4/23 18:38
 * @Author 瑾。
 * @Version 1.0
 * @Description 业务异常
 */
public class BaseException extends RuntimeException {
    public BaseException() {
    }
    public BaseException(String msg) {
        super(msg);
    }
}