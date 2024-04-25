package com.daofeng.system.service.impl;

import com.daofeng.system.entity.Comment;
import com.daofeng.system.entity.vo.CommentVo;
import com.daofeng.system.mapper.CommentMapper;
import com.daofeng.system.service.CommentService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.service.impl
 * @Date 2024/4/24 18:33
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<CommentVo> getCommentsByArticleId(Integer articleId) {
        List<Comment> comments = commentMapper.getCommentsByArticleId(articleId);
        if (comments == null) {
            return null;
        }
        List<CommentVo> tagList = new ArrayList<>();
        comments.forEach(comment -> {
            CommentVo commentVo = new CommentVo();
            BeanUtils.copyProperties(comment, commentVo);
            tagList.add(commentVo);
        });
        return tagList;
    }
}