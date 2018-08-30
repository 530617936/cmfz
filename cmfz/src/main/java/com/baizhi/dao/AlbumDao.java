package com.baizhi.dao;

import com.baizhi.entity.Album;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlbumDao {

    /*查询所有专辑*/
    public List<Album> selectAll();

    /*查询单张专辑*/
    public Album selectById(@Param("id")String id);
}
