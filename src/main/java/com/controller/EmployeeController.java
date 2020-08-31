package com.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Employee;
import com.service.EmployeeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Edo
 */
@RestController
@RequestMapping("/admin/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeServiceImpl;

    @RequestMapping("/findAll")
    public Map findAll(@RequestParam(name = "pageNum",required = true,defaultValue ="1") int page, @RequestParam(name = "size",required = true,defaultValue = "4") int size){
        System.out.println("表现层，查询所有的账户信息");
        //调用service方法

        PageHelper.startPage(page,size);
        List<Employee> list = employeeServiceImpl.findAll();
        PageInfo<Employee> pi = new PageInfo<>(list);
        Map map = new HashMap();
        map.put("employeeList",pi.getList());
        map.put("rowCount",pi.getTotal());
        map.put("pageCount",pi.getPages());
        return map;
    }

}
