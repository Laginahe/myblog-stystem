package com.daofeng.system.service;

import com.daofeng.system.entity.Article;
import com.daofeng.system.entity.vo.ArticleVo;

import java.util.List;

public interface ArticleService {
    ArticleVo getArticleById(Integer id);

    List<ArticleVo> getAllArticle();

    ArticleVo getArticleByTagId(Integer tagId);

    int deleteArticleById(Integer id);

    int saveArticle(Article article);

    int updateArticle(Article article);
}
