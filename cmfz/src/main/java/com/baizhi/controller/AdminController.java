package com.baizhi.controller;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    AdminService adminService;


    /*登录功能*/
    @RequestMapping("/login")
    public String login(String id ,String password){
        System.out.println(id + password);
        int result = adminService.selectById(id,password);
        if(result==1){
            return "redirect:/main/main.jsp";
        }else{
            return "redirect:/login.jsp";
        }

    }

}
