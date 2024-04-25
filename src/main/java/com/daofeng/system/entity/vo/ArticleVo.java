package com.daofeng.system.entity.vo;

import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity.vo
 * @Date 2024/4/23 11:59
 * @Author 瑾。
 * @Version 1.0
 * @Description 文章返回类
 */
@Data
public class ArticleVo {
    /**
     * 文章id
     */
    private Integer articleId;
    /**
     * 评论数
     */
    private Integer commentNumber;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 文章作者的id
     */
    private Integer authorId;
    private String authorName;
    /**
     * 文章创建时间
     */
    private String articleTime;
    /**
     * 标签id （分类Id）
     */
    private Integer tagId;
    private String tagName;
    /**
     * 文章封面url地址  article_cover
     */
    private Integer coverUrl;
    /**
     * 点赞数
     */
    private Integer likeNumber;
    private String content;
}