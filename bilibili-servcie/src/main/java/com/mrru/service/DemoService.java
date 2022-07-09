package com.mrru.service;

import com.mrru.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @className: DemoSer
 * @author: 茹某
 * @date: 2022/7/7 19:43
 **/
@Service
public class DemoService
{
    @Autowired
    private DemoDao demoDao;

    public Long query(Long id){
        return demoDao.query(id);
    }
}
