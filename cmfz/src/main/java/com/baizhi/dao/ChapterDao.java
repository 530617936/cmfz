package com.baizhi.dao;

import com.baizhi.entity.Chapter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChapterDao {

    /*根据albumid 查询 章节*/
    public List<Chapter> selectById(@Param("albumId")String albumId);
}
