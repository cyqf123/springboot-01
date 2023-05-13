package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


    @RequestMapping(value ="/hello" )
    public String test(){
        System.out.println("测试");
        return "hello";
    }


}
