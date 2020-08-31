package com.service;

import com.model.RolePermission;
import org.springframework.stereotype.Service;

@Service("rolePermissionService")
public interface RolePermissionService {

    void insert(RolePermission rolePermission);

    void delete(RolePermission rolePermission);
}
