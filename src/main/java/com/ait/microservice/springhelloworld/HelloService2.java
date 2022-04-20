package com.ait.microservice.springhelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class HelloService2 {
    @RequestMapping("/")
    public String index() {
        return "Hello World 2021....VERSION 2";
    }

    @RequestMapping("/abc")
    public String index2() {
        return "Hello World 2021 abc VERSION 2";
    }

}
