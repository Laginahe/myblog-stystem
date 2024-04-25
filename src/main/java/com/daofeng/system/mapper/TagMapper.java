package com.daofeng.system.mapper;

import com.daofeng.system.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.mapper
 * @Date 2024/4/24 17:45
 * @Author 瑾。
 * @Version 1.0
 * @Description 文章标签数据库操作
 */

@Mapper
public interface TagMapper {
    @Select("select * from tag where tag_id = #{id}")
    Tag getTagByTagId(String id);

    @Select("select * from tag where tag_name = #{name}")
    Tag getTagByTagName(String name);

    @Select("select * from tag")
    List<Tag> getAllTag();

}