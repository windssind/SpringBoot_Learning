package com.nju.spring_hello.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntorller {
    @RequestMapping("/hello")
    public String hello(){
        return "hello!\n";
    }

}
