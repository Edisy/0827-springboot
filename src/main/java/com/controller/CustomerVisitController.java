package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.CustomerVisit;
import com.model.Employee;
import com.service.CustomerVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/customerVisit")
public class CustomerVisitController {

    @Autowired
    private CustomerVisitService customerVisitServiceImpl;

    //用上分页的查询所有
    @ResponseBody
    @RequestMapping("/findAll")
    public Map findAll(@RequestParam(name = "pageNum",required = true,defaultValue ="1") int page, @RequestParam(name = "size",required = true,defaultValue = "4") int size){

        PageHelper.startPage(page,size);
        List<CustomerVisit> list = customerVisitServiceImpl.findAll();
        PageInfo<CustomerVisit> pi = new PageInfo<>(list);
        Map map = new HashMap();
        map.put("customerVisitList",pi.getList());
        map.put("rowCount",pi.getTotal());
        map.put("pageCount",pi.getPages());
        return map;
    }


    @RequestMapping("/delete")
    public void delete(Integer id){
        System.out.println(id);
        customerVisitServiceImpl.delete(id);
    }

    @RequestMapping("/save")
    public void save(CustomerVisit customerVisit){
        System.out.println("-------------"+customerVisit);
        customerVisitServiceImpl.insert(customerVisit);
    }

    @RequestMapping("/update")
    public void update(CustomerVisit customerVisit){

        customerVisitServiceImpl.update(customerVisit);
    }


    @ResponseBody
    @RequestMapping("/showUpdateCustomerVisit")
    public Map showUpdateCustomerVisit(Integer id){
        CustomerVisit customerVisit = customerVisitServiceImpl.findById(id);
        Map map = new HashMap();
        map.put("customerVisit",customerVisit);
        return map;
    }
}
