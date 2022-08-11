package com.stackroute.service;

import com.stackroute.model.UserProfile;
import com.stackroute.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class UserService  implements UserServiceInterface{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserProfile addProfile( UserProfile userProfile){
        UserProfile save=this.userRepository.save(userProfile);
        return save;
    }
@Override
    public UserProfile getProfile( String email){
        UserProfile get=this.userRepository.findByEmail(email);
        return get;
    }
@Override
    public UserProfile updateProfile(UserProfile userProfile, String email){

        UserProfile save=this.userRepository.findByEmail(email);
        save.setFirstName(userProfile.getFirstName());
        save.setLastName(userProfile.getLastName());
        save.setDob(userProfile.getDob());
        save.setGender(userProfile.getGender());
        save.setContactNumber(userProfile.getContactNumber());
        UserProfile updated=this.userRepository.save(save);
        return updated;
    }
}
