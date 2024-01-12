package com.example.test.controllers;


import com.example.test.service.InMemoryUserService;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String Hello(){

        return
                "<!DOCTYPE html>"+
                        "<html>"+
                        "	<head><title>Hello world!</title></head>"+
                        "	<body>Hello world! " + userService.getName() + " </body>"+
                        "</html>"
                ;
    }
}
