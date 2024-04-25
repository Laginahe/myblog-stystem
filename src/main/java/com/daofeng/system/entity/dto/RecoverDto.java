package com.daofeng.system.entity.dto;

import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity.dto
 * @Date 2024/4/23 12:11
 * @Author 瑾。
 * @Version 1.0
 * @Description 回复消息操作
 */

@Data
public class RecoverDto {
    private Integer commentId;

    private String userName;

    private String mail;

    private String wechat;

    private String content;

    private String time;
}