package com.daofeng.system.entity.dto;

import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity.dto
 * @Date 2024/4/23 12:08
 * @Author 瑾。
 * @Version 1.0
 * @Description 文章数据传输对象
 */
@Data
public class ArticleDto {
    /**
     * 文章id
     */
    private Integer articleId;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 文章作者的id
     */
    private Integer authorId;
    /**
     * 文章创建时间
     */
    private String articleTime;
    /**
     * 标签id （分类Id）
     */
    private Integer tagId;
    /**
     * 文章封面url地址  article_cover
     */
    private Integer coverUrl;
    private String content;
}