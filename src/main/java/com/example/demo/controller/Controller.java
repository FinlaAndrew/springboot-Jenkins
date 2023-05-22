package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/login")
    public String log(){
        return "Welcome to login page";
    }

    @GetMapping("/demo")
    public String demo(){
        return "Welcome to demo session";
    }
}
