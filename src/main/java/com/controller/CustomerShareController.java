package com.controller;

import com.model.CustomerShare;
import com.service.CustomerShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/customerShare")
public class CustomerShareController {

    @Autowired
    private CustomerShareService customerShareServiceImpl;


    @RequestMapping("/save")
    public void save(CustomerShare customerShare){
        System.out.println(customerShare);
        customerShareServiceImpl.insert(customerShare);
    }

    @RequestMapping("/delete")
    public void delete(Integer id){
        System.out.println(id);
        customerShareServiceImpl.delete(id);
    }

    @RequestMapping("/update")
    public void update(CustomerShare customerShare){
        System.out.println(customerShare);
        customerShareServiceImpl.update(customerShare);
    }
}
