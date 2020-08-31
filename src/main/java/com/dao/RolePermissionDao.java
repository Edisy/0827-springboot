package com.dao;

import com.model.RolePermission;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionDao {

    void insert(RolePermission rolePermission);

    void delete(RolePermission rolePermission);
}
