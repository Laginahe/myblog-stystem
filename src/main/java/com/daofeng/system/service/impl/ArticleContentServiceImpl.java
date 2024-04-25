package com.daofeng.system.service.impl;

import com.daofeng.system.entity.ArticleContent;
import com.daofeng.system.mapper.ArticleContentMapper;
import com.daofeng.system.service.ArticleContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.service.impl
 * @Date 2024/4/24 19:01
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */

@Service
public class ArticleContentServiceImpl implements ArticleContentService {
    @Autowired
    private ArticleContentMapper articleContentMapper;
    @Override
    public int addContent(ArticleContent articleContent) {
        return 0;
    }

    @Override
    public int updateContent(ArticleContent articleContent) {
        return 0;
    }

    @Override
    public ArticleContent getContentByArticleId(Integer articleId) {
        return articleContentMapper.getContentByArticleId(articleId);
    }

    @Override
    public int saveContent(ArticleContent articleContent) {
        if (articleContentMapper.saveContent(articleContent) > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteContent(Integer articleId) {
        return 0;
    }
}