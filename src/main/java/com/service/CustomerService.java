package com.service;

import com.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public interface CustomerService {

    List<Customer> findAll();

    void insert(Customer customer);

    void delete(int cusId);

    Customer findById(int cusId);

    void update(Customer customer);

    List<Customer> findSelfAndShare(Customer customer);

}
