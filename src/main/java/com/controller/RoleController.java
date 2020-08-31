package com.controller;

import com.model.Employee;
import com.model.Role;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin/role")
public class RoleController {

    @Autowired
    private RoleService roleServiceImpl;

    @ResponseBody
    @RequestMapping("/queryAll")
    public Map findAll(){
        List<Role> list = roleServiceImpl.findAll();
        Map map = new HashMap();
        map.put("list",list);
        return map;
    }
}
