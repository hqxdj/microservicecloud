package com.atguigu.springcloud.deptcontroller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atguigu.springcloud.service.DeptService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @PostMapping(value = "/add/dept")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/get/dept/{id}")
    public Dept get(@PathVariable Long id){
        return service.get(id);
    }

    @RequestMapping(value = "/list/dept")
    public List<Dept> list(){
        return service.list();
    }
}
