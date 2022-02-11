package com.pruebasjohn.pruebasjohn.config;

import com.pruebasjohn.pruebasjohn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Config {
    @Autowired
    UserService userService;

    @PostConstruct
    public void initDataBase() {
        userService.init();
    }
}
