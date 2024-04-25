package com.daofeng.system.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity
 * @Date 2024/4/23 11:36
 * @Author 瑾。
 * @Version 1.0
 * @Description 文章内容
 */

@Data
@Builder
public class ArticleContent {
    /**
     * 内容id
     */
    private Integer contentId;
    /**
     * 内容绑定的文章的id
     */
    private Integer articleId;
    /**
     * 文章内容
     */
    private String content;

}