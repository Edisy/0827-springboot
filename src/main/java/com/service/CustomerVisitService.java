package com.service;

import com.model.CustomerVisit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerVisitService")
public interface CustomerVisitService {

    List<CustomerVisit> findAll();


    void insert(CustomerVisit customerVisit);

    void delete(int id);

    CustomerVisit findById(int id);

    void update(CustomerVisit customerVisit);

    List<CustomerVisit> findSelfAndShare(CustomerVisit customerVisit);

}
