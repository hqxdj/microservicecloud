package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    //    private static final String URL_PRIFFIX = "http://localhost:8001";
    private static final String URL_PRIFFIX = "http://STUDY-SPRINGCLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/add/dept")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(URL_PRIFFIX + "/add/dept/", dept, boolean.class);
    }

    @RequestMapping(value = "/consumer/get/dept/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL_PRIFFIX + "/get/dept/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/list/dept")
    public List list() {
        return restTemplate.getForObject(URL_PRIFFIX + "/list/dept/", List.class);
    }
}
