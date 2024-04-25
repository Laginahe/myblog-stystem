package com.daofeng.system.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity.vo
 * @Date 2024/4/23 12:03
 * @Author 瑾。
 * @Version 1.0
 * @Description 评论返回类
 */
@Data
public class CommentVo {
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
    private String articleTitle;
    private String userName;
    private String mail;
    private String wechat;
    private String avatar;
    private Integer commentId;
    /**
     * 评论列表
     */
    private List<CommentVo> recoverVoList;
}