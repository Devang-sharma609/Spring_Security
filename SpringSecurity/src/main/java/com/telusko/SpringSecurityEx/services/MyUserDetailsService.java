package com.telusko.SpringSecurityEx.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.telusko.SpringSecurityEx.models.UserPrincipal;
import com.telusko.SpringSecurityEx.repos.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    public UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);

        if(user==null)
        {
            System.out.println("User not found");
            throw new UsernameNotFoundException(username);
        }return new UserPrincipal(user);
    }
    
}
