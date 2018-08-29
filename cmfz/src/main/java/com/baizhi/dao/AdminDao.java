package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;



public interface AdminDao {

    public Admin selectById(@Param("id") String id);



}
