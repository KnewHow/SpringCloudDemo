package com.knewhow.springcloud.controller;

import com.knewhow.springcloud.pojo.College;
import com.knewhow.springcloud.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @RequestMapping("/queryAll")
    public List<College> queryAll() {
        return collegeService.queryAll();
    }

    @RequestMapping("/queryByID/{id}")
    public College queryByID(@PathVariable("id") Long ID) {
        return collegeService.queryByID(ID);
    }

    @RequestMapping("/test")
    public String test() {
        return  "test data";
    }
}
