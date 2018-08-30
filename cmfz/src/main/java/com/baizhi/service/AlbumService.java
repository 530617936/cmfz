package com.baizhi.service;

import com.baizhi.entity.Album;

import java.util.List;

public interface AlbumService {
    /*查询所有专辑*/
    public List<Album>  selectAll();
    /*查询单张专辑*/
    public Album selectById(String id);
}
