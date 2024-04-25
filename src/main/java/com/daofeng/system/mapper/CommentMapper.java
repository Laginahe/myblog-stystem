package com.daofeng.system.mapper;

import com.daofeng.system.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {
    // 查询评论总数
    @Select("select count(*) from comment")
    Integer getCountComment();

    // 根据文章id查询评论
    @Select("select * from comment where article_id = #{articleId}")
    List<Comment> getCommentsByArticleId(Integer articleId);

    // 根据评论id查询评论
    @Select("select * from comment where id = #{id}")
    Comment getCommentById(Integer id);

}
