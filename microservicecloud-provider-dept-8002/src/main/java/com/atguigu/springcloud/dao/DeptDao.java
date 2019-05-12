package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
