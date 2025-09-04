package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    //登录
    Employee login(EmployeeLoginDTO employeeLoginDTO);
//查询
    void save(EmployeeDTO employeeDTO);
//分页查询
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
//禁用或者开启权限
    void startOrstop(Integer status, long id);
    //获取员工信息
   Employee getById(long id);
    //编辑员信息
    void update(EmployeeDTO employeeDTO);
}
