package com.service;

import com.model.Permission;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionService")
public interface PermissionService {
    List<Permission> findAll();

    List<Permission> queryAll();

    void insert(Permission permission);

    void delete(int pId);

    Permission findById(int pId);

    void update(Permission permission);

    List<Permission> getPsByRoleId(int roleId);
}
