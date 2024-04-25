package com.daofeng.system.mapper;

import com.daofeng.system.entity.ArticleContent;
import org.apache.ibatis.annotations.*;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.mapper
 * @Date 2024/4/24 18:45
 * @Author 瑾。
 * @Version 1.0
 * @Description 文章内容数据库操作
 */
@Mapper
public interface ArticleContentMapper {
    // 根据文章id获取文章内容
    @Select("select * from article_content where article_id = #{articleId}")
    ArticleContent getContentByArticleId(Integer articleId);

    // 修改文章内容
    @Update("update article_content set content = #{content} where article_id = #{articleId}")
    int updateContent(ArticleContent articleContent);

    // 插入文章内容
    @Insert("insert into article_content(article_id, content) values(#{articleId}, #{content})")
    int saveContent(ArticleContent articleContent);

    // 删除文章内容
    @Delete("delete from article_content where article_id = #{articleId}")
    int deleteContent(Integer articleId);
}