package com.service.impl;

import com.dao.PermissionDao;
import com.model.Permission;
import com.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionServiceImpl")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }

    @Override
    public List<Permission> queryAll() {
        return permissionDao.queryAll();
    }

    @Override
    public void insert(Permission permission) {
        permissionDao.insert(permission);
    }

    @Override
    public void delete(int pId) {
        permissionDao.delete(pId);
    }

    @Override
    public Permission findById(int pId) {
        return permissionDao.findById(pId);
    }

    @Override
    public void update(Permission permission) {
        permissionDao.update(permission);
    }

    @Override
    public List<Permission> getPsByRoleId(int roleId) {

        return permissionDao.getPsByRoleId(roleId);
    }
}
