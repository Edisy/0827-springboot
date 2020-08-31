package com.service.impl;

import com.dao.CustomerVisitDao;
import com.model.CustomerVisit;
import com.service.CustomerVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerVisitServiceImpl")
public class CustomerVisitServiceImpl implements CustomerVisitService {

    @Autowired
    private CustomerVisitDao customerVisitDao;

    @Override
    public List<CustomerVisit> findAll() {
        return customerVisitDao.findAll();
    }

    @Override
    public void insert(CustomerVisit customerVisit) {
        customerVisitDao.insert(customerVisit);
    }

    @Override
    public void delete(int id) {
        customerVisitDao.delete(id);
    }

    @Override
    public CustomerVisit findById(int id) {
        return customerVisitDao.findById(id);
    }

    @Override
    public void update(CustomerVisit customerVisit) {
        customerVisitDao.update(customerVisit);
    }

    @Override
    public List<CustomerVisit> findSelfAndShare(CustomerVisit customerVisit) {
        return customerVisitDao.findSelfAndShare(customerVisit);
    }
}
