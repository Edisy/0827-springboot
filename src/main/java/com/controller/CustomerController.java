package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Customer;
import com.model.Employee;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 顾客web层
 * */

@RestController
@RequestMapping("/admin/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerServiceImpl;

    //需要分页的查询所有
    @ResponseBody
    @RequestMapping("/findAll")
    public Map findAll(@RequestParam(name = "pageNum",required = true,defaultValue ="1") int page, @RequestParam(name = "size",required = true,defaultValue = "4") int size){
        PageHelper.startPage(page,size);
        List<Customer> list = customerServiceImpl.findAll();
        PageInfo<Customer> pi = new PageInfo<>(list);
        Map map = new HashMap();
        map.put("customerList",pi.getList());
        map.put("rowCount",pi.getTotal());
        map.put("pageCount",pi.getPages());
        return map;
    }


    @RequestMapping("/save")
    public void save(Customer customer){
        System.out.println(customer);
        customerServiceImpl.insert(customer);
    }

    @RequestMapping("/delete")
    public void delete(Integer cusId){
        System.out.println(cusId);
        customerServiceImpl.delete(cusId);
    }


    @RequestMapping("/update")
    public void update(Customer customer){
        System.out.println(customer);
        customerServiceImpl.update(customer);
    }



    @ResponseBody
    @RequestMapping("/showUpdateCustomer")
    public Map showUpdateCustomer(Integer cusId){
        System.out.println(cusId);
        Customer customer = customerServiceImpl.findById(cusId);
        System.out.println(customer);
        Map map = new HashMap();
        map.put("customer",customer);
        return map;
    }

}
