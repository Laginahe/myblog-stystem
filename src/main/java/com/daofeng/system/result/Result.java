package com.daofeng.system.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.result
 * @Date 2024/4/23 15:00
 * @Author 瑾。
 * @Version 1.0
 * @Description 后端统一返回结果
 */

@Data
public class Result<T>  implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.code=200;
        return result;
    }

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<>();
        result.code = 200;
        result.data = object;
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result<>();
        result.code = 500;
        result.msg = msg;
        return result;
    }
}