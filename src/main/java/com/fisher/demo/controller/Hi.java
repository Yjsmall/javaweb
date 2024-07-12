package com.fisher.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {
    @GetMapping("{name}")
    public String hi(@PathVariable String name) {
        System.out.println("hi " + name);
        return name;
    }
}
