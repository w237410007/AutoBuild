package com.xyz.autobuilder.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyz.autobuilder.ResultBo;
import com.xyz.autobuilder.mapper.ContentMapper;
import com.xyz.autobuilder.po.ContentPo;
import com.xyz.autobuilder.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("content")
public class ContentController {

    @Autowired
    ContentService contentService;

    @RequestMapping(value="/findAll", method = RequestMethod.GET)
    public ResultBo findAll() {
        ResultBo result = new ResultBo();
        List<ContentPo> contentPoList = contentService.findAll();
        result.setData(contentPoList);

        return result;
    }
}
