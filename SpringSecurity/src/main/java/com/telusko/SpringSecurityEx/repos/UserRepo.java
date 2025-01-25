package com.telusko.SpringSecurityEx.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.telusko.SpringSecurityEx.models.AppUser;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Integer>{

    User findByUsername(String username);
    
}
