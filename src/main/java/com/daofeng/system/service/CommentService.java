package com.daofeng.system.service;

import com.daofeng.system.entity.vo.CommentVo;

import java.util.List;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.service
 * @Date 2024/4/24 18:31
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */
public interface CommentService {
    List<CommentVo> getCommentsByArticleId(Integer articleId);
}