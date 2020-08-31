package com.service.impl;

import com.dao.EmployeeDao;
import com.model.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee selectByUserName(String UserName) {
        Employee emp = employeeDao.selectByUserName(UserName);
        return emp;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void insert(Employee employee) {
        employeeDao.insert(employee);
    }

    @Override
    public void delete(int cusId) {
        employeeDao.delete(cusId);
    }

    @Override
    public Employee findById(int cusId) {
        return employeeDao.findById(cusId);
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public Employee getByUserName(String userName) {

        return employeeDao.getByUserName(userName);
    }


}
