package com.telusko.SpringSecurityEx.controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FrontController {
    
    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Hello "+request.getSession().getId();
    }
}
