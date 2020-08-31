package com.dao;

import com.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {

    Employee selectByUserName(String UserName);

    List<Employee> findAll();

    void insert(Employee employee);

    void delete(int cusId);

    Employee findById(int cusId);

    void update(Employee employee);

    Employee getByUserName(String userName);
}
