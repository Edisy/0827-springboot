package com.dao;

import com.model.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionDao {

    List<Permission> findAll();

    List<Permission> queryAll();

    void insert(Permission permission);

    void delete(int pId);

    Permission findById(int pId);

    void update(Permission permission);

    List<Permission> getPsByRoleId(int roleId);
}
