package com.daofeng.system.service;

import com.daofeng.system.entity.vo.TagVo;

import java.util.List;

public interface TagService {
    String getTagNameById(Integer tagId);

    Integer getTagIdByTagName(String tagName);
    TagVo getTagByTagId(Integer tagId);

    List<TagVo> getAllCategories();
}
