package com.daofeng.system.mapper;

import com.daofeng.system.entity.Article;
import com.daofeng.system.entity.vo.ArticleVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface ArticleMapper {
    /**
     * 文章的增删改查
     */

    // 根据id查询文章
    @Select("select * from article where article_id = #{id}")
    Article getArticleById(Integer id);

    // 查询所有文章
    @Select("select * from article")
    List<Article> getAllArticle();

    // 根据标签id查询文章
    @Select("select * from article where tag_id = #{tagId}")
    Article getArticleByTagId(Integer tagId);

    /**
     * 删除文章
     * @param id
     * @return 1-删除成功
     */
    @Delete("delete from article where article_id = #{id}")
    int deleteArticleById(Integer id);

    /**
     * 添加文章
     * @param article
     * @return 1-添加成功
     */
    @Insert(" insert into article(comment_number, article_title, author_id, article_time, tag_id, article_cover, like_Number)\n" +
            "        VALUES (#{commentNumber},#{articleTitle},#{authorId},#{articleTime},#{tagId},#{coverUrl},#{likeNumber})")
    int saveArticle(Article article);

    /**
     * 修改文章
     * @param article
     * @return 1-修改成功
     */
    int updateArticle(Article article);

}
