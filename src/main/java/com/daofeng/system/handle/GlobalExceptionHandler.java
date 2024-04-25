package com.daofeng.system.handle;

import com.daofeng.system.exception.BaseException;
import com.daofeng.system.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.BaseExecutor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.handle
 * @Date 2024/4/23 18:33
 * @Author 瑾。
 * @Version 1.0
 * @Description 局异常处理器，处理项目中抛出的业务异常
 */
@RestControllerAdvice // 全局异常处理器
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 捕获业务异常
     * @param ex
     * @return
     */
    @ExceptionHandler
    public Result exceptionHandler(BaseException ex) {
        log.error("异常信息：{}", ex.getMessage());
        return Result.error(ex.getMessage());
    }

    public Result exceptionHandler(SQLIntegrityConstraintViolationException ex) {
        String message = ex.getMessage();
        if (message.contains("Duplicate entry")) {
            String[] split = message.split(" ");
            String msg = split[2] + "已存在";
            return Result.error(msg);
        } else {
            return Result.error("未知错误");
        }
    }
}