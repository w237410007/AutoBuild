package com.xyz.autobuilder.mapper;

import com.xyz.autobuilder.po.ContentPo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface ContentMapper {

    @Select("select * from content")
    List<ContentPo> findAll();

    @Insert("insert into " +
            "content(title,content,desc,type,attachment)" +
            " values(#{param.title},#{param.content},#{param.desc},#{param.type},#{param.attachment},")
    void add(ContentPo contentPo);
}
