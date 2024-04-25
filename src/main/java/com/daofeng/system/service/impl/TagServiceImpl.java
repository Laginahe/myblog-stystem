package com.daofeng.system.service.impl;

import com.daofeng.system.entity.Tag;
import com.daofeng.system.entity.vo.TagVo;
import com.daofeng.system.mapper.TagMapper;
import com.daofeng.system.service.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.service.impl
 * @Date 2024/4/24 18:00
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;

    @Override
    public String getTagNameById(Integer tagId) {
        return null;
    }

    @Override
    public Integer getTagIdByTagName(String tagName) {
        return null;
    }

    @Override
    public TagVo getTagByTagId(Integer tagId) {
        return null;
    }

    @Override
    public List<TagVo> getAllCategories() {
        List<Tag> allTag = tagMapper.getAllTag();
        List<TagVo> tagVos = new ArrayList<>();
        allTag.forEach(tag -> {
            TagVo tagVo = new TagVo();
            BeanUtils.copyProperties(tag, tagVo);
            tagVos.add(tagVo);
        });
        return tagVos;
    }
}