package com.telusko.SpringSecurityEx.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class AppUser {

    @Id
    private int id;
    private String username;
    private String password;

    
}
