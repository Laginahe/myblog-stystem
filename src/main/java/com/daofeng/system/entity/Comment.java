package com.daofeng.system.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity
 * @Date 2024/4/23 11:40
 * @Author 瑾。
 * @Version 1.0
 * @Description 文章评论
 */
@Data
@Builder
public class Comment {
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