package com.atguiug.springboot.repository;

import com.atguiug.springboot.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 时间：  2020/2/19
 * 创建者：  Administrator 钟文
 * 描述： //继承JpaRepository来完成对数据库的操作
 * 参数：Integer  主键类型  Department响应实体类
 * 返回值：
 **/
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
