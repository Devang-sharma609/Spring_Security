package com.telusko.SpringSecurityEx.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.telusko.SpringSecurityEx.models.AppUser;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserController {
    

    public List<AppUser> users = new ArrayList<>(List.of(
        new AppUser(21, "chawan", "chawan@123"),
        new AppUser(24, "dhawan","dhawan@123")
    ));

    @GetMapping("/users")
    public List<AppUser> getUsers() {
        return users;
    }

    @GetMapping("/csrf-token")
    public CsrfToken gCsrfToken(HttpServletRequest request)
    {
        return (CsrfToken) request.getAttribute("_csrf");
    }   
}
