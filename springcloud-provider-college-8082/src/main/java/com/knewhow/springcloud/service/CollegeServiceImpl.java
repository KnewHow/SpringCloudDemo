package com.knewhow.springcloud.service;

import com.knewhow.springcloud.mapper.CollegeMapper;
import com.knewhow.springcloud.pojo.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements  CollegeService{

    @Autowired
    private CollegeMapper collegeMapper;

    @Override
    public List<College> queryAll() {
        return collegeMapper.queryAll();
    }

    @Override
    public College queryByID(Long ID) {
        return collegeMapper.queryByID(ID);
    }
}
