package com.atguiug.springboot.controller;

import com.atguiug.springboot.Entity.Department;
import com.atguiug.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * 时间：  2020/2/19
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping("/dept/{id}")
   Department getDept(@PathVariable("id") Integer id){
        Department one = departmentRepository.findById(id).get();
        return one;
    }

    @GetMapping("/dept")
    Department insert(Department department){
        Department save = departmentRepository.save(department);
        return save;

    }
}



