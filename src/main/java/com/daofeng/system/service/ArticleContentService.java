package com.daofeng.system.service;

import com.daofeng.system.entity.ArticleContent;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.service.impl
 * @Date 2024/4/24 18:54
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */
public interface ArticleContentService {
    int addContent(ArticleContent articleContent);

    int updateContent(ArticleContent articleContent);

    ArticleContent getContentByArticleId(Integer articleId);

    int saveContent(ArticleContent articleContent);

    int deleteContent(Integer articleId);

}