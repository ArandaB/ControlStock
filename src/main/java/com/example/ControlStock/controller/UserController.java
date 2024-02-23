package com.example.ControlStock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/api/prueba")
    public String get(){
        return "hello world";
    }
}
