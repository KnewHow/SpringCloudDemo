package com.knewhow.springcloud.mapper;

import com.knewhow.springcloud.pojo.College;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CollegeMapper {
    List<College> queryAll();
    public College queryByID(Long ID);
}
