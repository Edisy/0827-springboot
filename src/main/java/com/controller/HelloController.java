package com.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Edo
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        return "你好杭州666";
    }
}
