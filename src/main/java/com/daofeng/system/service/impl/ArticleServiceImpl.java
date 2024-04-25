package com.daofeng.system.service.impl;

import com.daofeng.system.entity.Article;
import com.daofeng.system.entity.dto.ArticleDto;
import com.daofeng.system.entity.vo.ArticleVo;
import com.daofeng.system.exception.BaseException;
import com.daofeng.system.mapper.ArticleMapper;
import com.daofeng.system.mapper.UserMapper;
import com.daofeng.system.service.ArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.service.impl
 * @Date 2024/4/24 14:50
 * @Author 瑾。
 * @Version 1.0
 * @Description 文章 服务实现类
 */

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public ArticleVo getArticleById(Integer id) {
        Article articleById = articleMapper.getArticleById(id);
        ArticleVo articleVo = new ArticleVo();
        // 将articleById的属性复制到articleDto
        BeanUtils.copyProperties(articleById, articleVo);
        // 通过authorId获取作者名
        articleVo.setAuthorName(userMapper.getUserNameById(articleById.getAuthorId()));
        /**
         * TODO: 2024/4/24
         * articleVo 还需要获取 文章标签名字 内容
         */

        return articleVo;
    }

    @Override
    public List<ArticleVo> getAllArticle() {
        return null;
    }

    @Override
    public ArticleVo getArticleByTagId(Integer tagId) {
       return null;
    }

    @Override
    public int deleteArticleById(Integer id) {
        return articleMapper.deleteArticleById(id);
    }

    @Override
    public int saveArticle(Article article) {
        return articleMapper.saveArticle(article);
    }

    @Override
    public int updateArticle(Article article) {
        return articleMapper.updateArticle(article);
    }
}