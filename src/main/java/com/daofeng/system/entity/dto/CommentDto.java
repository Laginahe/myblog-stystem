package com.daofeng.system.entity.dto;

import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity.dto
 * @Date 2024/4/23 12:07
 * @Author 瑾。
 * @Version 1.0
 * @Description dto包：前端传输给后端的数据
 */
@Data
public class CommentDto {
    /**
     * 评论id
     */
    private Integer id;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论时间
     */
    private String time;
    private Integer articleId;
    private String userName;
    private String mail;
    private String wechat;
    private String avatar;
    private Integer commentId;
}