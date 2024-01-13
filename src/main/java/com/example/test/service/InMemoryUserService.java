package com.example.test.service;

import org.springframework.stereotype.Service;

@Service("InMemoryUserService")
public class InMemoryUserService implements UserService {

    private String name;

    public InMemoryUserService() {
        this.name = "Ilia";
    }

    public String getName() {
        return name;
    }
}
