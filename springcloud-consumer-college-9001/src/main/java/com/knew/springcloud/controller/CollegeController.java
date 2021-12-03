package com.knew.springcloud.controller;

import com.knewhow.springcloud.pojo.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/college")
public class CollegeController {

    @Autowired
    private RestTemplate restTemplate;

    private  static final String REST_URL_PREFIX = "http://127.0.0.1:8081/college";

    @RequestMapping("/queryAll")
    public List<College> queryAll() {

        return restTemplate.getForObject(REST_URL_PREFIX + "/queryAll", List.class);
    }

    @RequestMapping("/queryByID/{id}")
    public College queryByID(@PathVariable("id") Long ID) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/queryByID/" + ID, College.class);
    }
}
