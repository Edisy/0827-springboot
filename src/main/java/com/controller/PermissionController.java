package com.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Permission;
import com.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionServiceImpl;

    @ResponseBody
    @RequestMapping("/findAll")
    public Map findAll(@RequestParam(name = "pageNum",required = true,defaultValue ="1") int page, @RequestParam(name = "size",required = true,defaultValue = "4") int size){
        PageHelper.startPage(page,size);
        List<Permission> list = permissionServiceImpl.findAll();
        PageInfo<Permission> pi = new PageInfo<>(list);
        Map map = new HashMap();
        map.put("permissionList",pi.getList());
        map.put("rowCount",pi.getTotal());
        map.put("pageCount",pi.getPages());
        return map;
    }

    @ResponseBody
    @RequestMapping("/queryAll")
    public Map findAll(){
        List<Permission> list = permissionServiceImpl.queryAll();
        Map map = new HashMap();
        map.put("list",list);
        return map;
    }
}
