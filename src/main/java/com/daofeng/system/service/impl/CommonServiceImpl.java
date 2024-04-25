package com.daofeng.system.service.impl;

import com.daofeng.system.mapper.CommonMapper;
import com.daofeng.system.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.service.impl
 * @Date 2024/4/24 12:38
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private CommonMapper commonMapper;
    @Override
    public Integer getCountPage() {
        return commonMapper.getCountPage();
    }

    @Override
    public Integer getCountPageByTagId(Integer tagId) {
        return commonMapper.getCountPageByTagId(tagId);
    }
}