package com.stackroute.service;

import com.stackroute.entity.User;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService, UserService {
    @Autowired
    private UserRepository repository;


    @Override
    public void saveUser(User user) {
        System.out.println(user);
        repository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = repository.findByUserName(username);
        User user = repository.findByEmail(email);
        System.out.println(user + "  -  Printitn user in my user details service");

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
        };
}
