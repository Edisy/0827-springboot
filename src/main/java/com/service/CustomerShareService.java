package com.service;

import com.model.CustomerShare;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerShareService")
public interface CustomerShareService {

    List<CustomerShare> findAll();

    void insert(CustomerShare customerShare);

    void delete(int id);

    CustomerShare findById(int id);

    void update(CustomerShare cutomerShare);
}
