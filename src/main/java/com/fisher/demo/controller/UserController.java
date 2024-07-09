package com.fisher.demo.controller;

import com.fisher.demo.model.User;
import com.fisher.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "获取所有用户列表")
    @GetMapping("/all")
    public List<User> getAll() {
        return userService.findAll();
    }

    @Operation(summary = "用户的详细信息")
    @GetMapping("/all/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

}
