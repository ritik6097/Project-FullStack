package com.stackroute.service;

import com.stackroute.model.UserProfile;
import com.stackroute.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserProfile addProfile( UserProfile userProfile){
        UserProfile save=this.userRepository.save(userProfile);
        return save;
    }

    public UserProfile getProfile( String email){
        UserProfile get=this.userRepository.findByEmail(email);
        return get;
    }

    public UserProfile updateProfile( UserProfile userProfile){

        UserProfile save=this.userRepository.save(userProfile);
        return save;
    }
}
