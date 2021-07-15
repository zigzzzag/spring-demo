package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.example.demo.controller",
        "com.example.demo.scope"
})
public class RestDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(RestDemoApp.class, args);
    }
}
