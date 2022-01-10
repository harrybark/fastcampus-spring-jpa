package com.fastcampus.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-api")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String hello() {
        return "Hello SpringData JPA";
    }
}
