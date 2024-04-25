package com.daofeng.system.controller;

import com.daofeng.system.entity.Article;
import com.daofeng.system.entity.dto.ArticleDto;
import com.daofeng.system.entity.vo.ArticleVo;
import com.daofeng.system.result.Result;
import com.daofeng.system.service.ArticleService;
import com.daofeng.system.service.CommentService;
import com.daofeng.system.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.controller
 * @Date 2024/4/23 14:50
 * @Author 瑾。
 * @Version 1.0
 * @Description 文章 控制器
 */

@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private TagService tagService;
    @Autowired
    private CommentService commentService;

    @GetMapping("/detail/{id}")
    public ModelAndView getArticledDtailById(@PathVariable Integer id, Model model) {
        ArticleVo article = articleService.getArticleById(id);
        /**
         * TODO 还有获取文章内容 文章评论
         */
        model.addAttribute("article", article);

        // 跳转到 客户端的文章详情页
        return new ModelAndView("client/article");
    }

    @GetMapping("/deleteArticleById")
    public Result deleteArticleById(Integer id) {
        int result = articleService.deleteArticleById(id);
        if(result > 0) {
            return Result.success("删除成功");
        }
        return Result.error("删除失败");
    }
}