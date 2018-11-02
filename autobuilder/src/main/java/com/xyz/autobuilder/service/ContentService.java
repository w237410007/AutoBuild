package com.xyz.autobuilder.service;

import com.xyz.autobuilder.bo.ContentBo;
import com.xyz.autobuilder.mapper.ContentMapper;
import com.xyz.autobuilder.po.ContentPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    @Autowired
    ContentMapper contentMapper;

    /**
     * 查询所有内容
     * @return 所有内容
     */
    public List<ContentPo> findAll() {
        return contentMapper.findAll();
    }
}
