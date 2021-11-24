package com.example.jenkinst2.controller;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @org.springframework.web.bind.annotation.GetMapping("/")
    public java.lang.String getHello() {
        return "Hello World";
    }
}

