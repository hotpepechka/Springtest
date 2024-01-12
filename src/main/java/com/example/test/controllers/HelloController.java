package com.example.test.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String Hello(){
        return
                "<!DOCTYPE html>"+
                        "<html>"+
                        "	<head><title>Hello world!</title></head>"+
                        "	<body>Hello world!</body>"+
                        "</html>"
                ;
    }
}
