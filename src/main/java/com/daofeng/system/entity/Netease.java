package com.daofeng.system.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity
 * @Date 2024/4/23 11:46
 * @Author 瑾。
 * @Version 1.0
 * @Description 网易云热评
 */
@Data
@Builder
public class Netease {
    /**
     * 热评id
     */
    private Integer cloudId;
    /**
     * 热捧内容
     */
    private String content;
    /**
     * 热评来源
     */
    private String source;
}