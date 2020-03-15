package com.leiax00.jctec.controller;

import com.leiax00.jctec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private UserService userService;

    @GetMapping("/hello")
    public UserDetails hello() {
        return userService.loadUserByUsername("leiax00");
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
