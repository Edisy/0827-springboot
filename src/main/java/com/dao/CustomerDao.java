package com.dao;

import com.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {

    List<Customer> findAll();

    void insert(Customer customer);

    void delete(int cusId);

    Customer findById(int cusId);

    void update(Customer customer);

    List<Customer> findSelfAndShare(Customer customer);
}
