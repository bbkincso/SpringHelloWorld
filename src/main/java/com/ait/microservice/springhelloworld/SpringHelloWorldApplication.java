package com.ait.microservice.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHelloWorldApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringHelloWorldApplication.class, args);
        System.out.println("Hello World 2021");
    }
}
