package com.baizhi.service;

import com.baizhi.entity.Banner;
import java.util.Map;


public interface BannerService {

    public Map<String, Object> selectAll(Integer nowPage, Integer pageSize);

    public int insert(Banner banner);

    /*更新数据*/
    public int update(Banner banner);

    /*删除数据*/
    public int delete(String id);
}
