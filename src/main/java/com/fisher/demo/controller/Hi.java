package com.fisher.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {
    @GetMapping("hello")
    public String hello(Integer name) {
        return "hello " + name;
    }

}
