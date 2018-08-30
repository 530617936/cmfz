package com.baizhi.controller;

import com.baizhi.entity.Banner;
import com.baizhi.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
@RequestMapping("/Banner")
public class BannerController {
    @Autowired
    BannerService bannerService;


    /*查询所有轮播图*/
    @RequestMapping("/selectAll")
    @ResponseBody
    public Map<String, Object> selectAll(@RequestParam("page")Integer nowPage, @RequestParam("rows")Integer pageSize){
        return bannerService.selectAll(nowPage, pageSize);
    }

    /*添加轮播图*/
    @RequestMapping("/insert")
    public int insert(Banner banner){
        return bannerService.insert(banner);
    }

    /*更新轮播图信息*/
    @RequestMapping("update")
    public int update(Banner banner){
        return bannerService.update(banner);
    }

    /*删除轮播图*/
    @RequestMapping("/delete")
    public int delete(String id){

        return bannerService.delete(id);
    }
}
