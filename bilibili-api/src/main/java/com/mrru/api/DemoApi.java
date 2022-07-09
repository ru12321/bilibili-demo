package com.mrru.api;

import com.mrru.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @className: DemoApi
 * @author: 茹某
 * @date: 2022/7/7 19:46
 **/
@RestController
public class DemoApi
{
    @Autowired
    private DemoService demoService;

    @GetMapping("/query")
    public Long query(Long id){
        return demoService.query(id);
    }
}
