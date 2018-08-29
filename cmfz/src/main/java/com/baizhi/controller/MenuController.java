package com.baizhi.controller;

import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<Menu> selectAll(){

       return  menuService.selectAll();
    }
}
