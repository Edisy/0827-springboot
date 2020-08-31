package com.service.impl;

import com.dao.CustomerDao;
import com.model.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Edo
 */
@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> findAll() {
        System.out.println("业务层，查询所有顾客");
        return customerDao.findAll();
    }

    @Transactional
    @Override
    public void insert(Customer customer) {
        System.out.println("业务层，插入一条顾客信息");
        customerDao.insert(customer);
    }

    @Override
    public void delete(int cusId) {
        customerDao.delete(cusId);
    }

    @Override
    public Customer findById(int cusId) {
        return customerDao.findById(cusId);
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }

    @Override
    public List<Customer> findSelfAndShare(Customer customer) {
        return customerDao.findSelfAndShare(customer);
    }
}
