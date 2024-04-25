package com.daofeng.system.entity.vo;

import lombok.Data;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.entity.vo
 * @Date 2024/4/24 17:57
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */

@Data
public class TagVo {
    /**
     * 标签名
     */
    private String tagName;
    /**
     * 标签id
     */
    private Integer tagId;

}