package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {

    @GetMapping("/docker/hello")
    public String hello() {
        return "Welcome to Docker!";
    }
}
