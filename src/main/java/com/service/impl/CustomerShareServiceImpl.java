package com.service.impl;

import com.dao.CustomerShareDao;
import com.model.CustomerShare;
import com.service.CustomerShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerShareServiceImpl")
public class CustomerShareServiceImpl implements CustomerShareService {

    @Autowired
    private CustomerShareDao customerShareDao;

    @Override
    public List<CustomerShare> findAll() {
        return customerShareDao.findAll();
    }

    @Override
    public void insert(CustomerShare customerShare) {
        customerShareDao.insert(customerShare);
    }

    @Override
    public void delete(int id) {
        customerShareDao.delete(id);
    }

    @Override
    public CustomerShare findById(int id) {
        return customerShareDao.findById(id);
    }

    @Override
    public void update(CustomerShare cutomerShare) {
        customerShareDao.update(cutomerShare);
    }
}
