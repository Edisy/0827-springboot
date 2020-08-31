package com.dao;

import com.model.CustomerVisit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerVisitDao {

    List<CustomerVisit> findAll();

    void insert(CustomerVisit customerVisit);

    void delete(int id);

    CustomerVisit findById(int id);

    void update(CustomerVisit customerVisit);

    List<CustomerVisit> findSelfAndShare(CustomerVisit customerVisit);
}
