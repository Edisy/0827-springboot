package com.service.impl;

import com.dao.RolePermissionDao;
import com.model.RolePermission;
import com.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rolePermissionServiceImpl")
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionDao rolePermissionDao;

    @Override
    public void insert(RolePermission rolePermission) {
        rolePermissionDao.insert(rolePermission);
    }

    @Override
    public void delete(RolePermission rolePermission) {
        rolePermissionDao.delete(rolePermission);
    }
}
