package com.mrru.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @className: DemoDao
 * @author: 茹某
 * @date: 2022/7/7 19:37
 **/
@Mapper
public interface DemoDao
{
    public Long query(Long id);
}
