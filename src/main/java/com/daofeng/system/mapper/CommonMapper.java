package com.daofeng.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.mapper
 * @Date 2024/4/24 12:28
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */
@Mapper
public interface CommonMapper {
    //获取总页数
    @Select("select ceil(count(*)/9) from article")
    public Integer getCountPage();

    //根据标签id(分类)获取总页数
    @Select("select ceil(count(*)/9) from article where tag_id = #{tagId}")
    public Integer getCountPageByTagId(Integer tagId);
}