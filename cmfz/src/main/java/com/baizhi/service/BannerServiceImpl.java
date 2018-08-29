package com.baizhi.service;

import com.baizhi.dao.BannerDao;
import com.baizhi.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BannerServiceImpl implements BannerService{
    @Autowired
    BannerDao bannerDao;
    @Override
    public Map<String, Object> selectAll(Integer nowPage, Integer pageSize) {
        int begin = (nowPage-1)*pageSize;
        List<Banner> list = bannerDao.selectAll( begin , pageSize);
        int count = bannerDao.selectCount();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total", count);
        map.put("rows", list);
        return map;
    }

    @Override
    public int insert(Banner banner) {
        return bannerDao.insert(banner);
    }

    @Override
    public int update(Banner banner) {
        return bannerDao.update(banner);
    }

    @Override
    public int delete(String id) {

        return bannerDao.delete(id);

    }
}
