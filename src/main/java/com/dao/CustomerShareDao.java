package com.dao;

import com.model.CustomerShare;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerShareDao {

    List<CustomerShare> findAll();

    void insert(CustomerShare customerShare);

    void delete(int id);

    CustomerShare findById(int id);

    void update(CustomerShare cutomerShare);
}
