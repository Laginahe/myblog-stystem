package com.daofeng.system.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity
 * @Date 2024/4/23 11:48
 * @Author 瑾。
 * @Version 1.0
 * @Description 标签实体类
 */
@Data
@Builder
public class Tag {
    /**
     * 标签id
     */
    private Integer tagId;
    /**
     * 标签名
     */
    private String tagName;
    private String tagUrl;
}