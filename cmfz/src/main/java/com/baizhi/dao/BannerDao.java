package com.baizhi.dao;

import com.baizhi.entity.Banner;
import org.apache.ibatis.annotations.Param;


import java.util.List;


public interface BannerDao {

    /*查询所有图片*/
    public List<Banner> selectAll(@Param("begin") Integer begin, @Param("pageSize") Integer pageSize);

    /*查询图片总数*/
    public int selectCount();

    /*添加图片*/
    public int insert(Banner banner);

    /*更新图片信息*/
    public int update(Banner banner);

    /*删除轮播图信息*/
    public int delete(@Param("id") String id);



}
