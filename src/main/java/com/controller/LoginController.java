package com.controller;

import com.model.Employee;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/employee")
public class LoginController {

    @RequestMapping("/login")
    public String login(Employee emp){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(emp.getUserName(), emp.getUserPassword());
        try{
            subject.login(token);
            return "redirect:/admin/index.html";
        }catch (AuthenticationException e){
            e.printStackTrace();
            return "redirect:/login.html";
        }
    }

}
