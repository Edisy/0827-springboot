package com.service;

import com.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public interface EmployeeService {

    Employee selectByUserName(String UserName);

    List<Employee> findAll();

    void insert(Employee employee);

    void delete(int cusId);

    Employee findById(int cusId);

    void update(Employee employee);

    Employee getByUserName(String userName);

}
