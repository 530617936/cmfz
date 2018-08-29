package com.baizhi.service;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public int selectById(String id,String password) {
        Admin admin = adminDao.selectById(id);
        if(admin!=null){
            if(admin.getPassword().equals(password)){
                return 1;
            }
            return 0;
        }
        return 0;
    }


}
