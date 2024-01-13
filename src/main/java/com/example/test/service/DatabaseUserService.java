package com.example.test.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class DatabaseUserService implements UserService{

    @Override
    public String getName() {
        return "Stas";
    }
}
