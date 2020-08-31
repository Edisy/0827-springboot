package com.controller;

import com.model.RolePermission;
import com.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/rolePermission")
public class RolePermissionController {

    @Autowired
    private RolePermissionService rolePermissionServiceImpl;


    @RequestMapping("/save")
    public void save(RolePermission rolePermission){
        System.out.println(rolePermission);
        rolePermissionServiceImpl.insert(rolePermission);
    }

    @RequestMapping("/delete")
    public void delete(RolePermission rolePermission){
        System.out.println(rolePermission);
        rolePermissionServiceImpl.delete(rolePermission);
    }

}
