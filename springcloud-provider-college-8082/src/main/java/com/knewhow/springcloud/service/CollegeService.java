package com.knewhow.springcloud.service;

import com.knewhow.springcloud.pojo.College;

import java.util.List;

public interface CollegeService {
    List<College> queryAll();
    public College queryByID(Long ID);
}
