package com.baizhi.controller;

import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Album")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @RequestMapping("selectAll")
    @ResponseBody
    public List<Album> selectAll(){
        return albumService.selectAll();
    }

    @RequestMapping("selectById")
    @ResponseBody
    public Album selectById(String id){
        return albumService.selectById(id);
    }
}
