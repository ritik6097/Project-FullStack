package com.stackroute.service;

import com.stackroute.exception.UserAlreadyExistException;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.model.UserProfile;

import java.util.Optional;

public interface UserServiceInterface {



    // to post register_info first time
    public UserProfile addProfile(UserProfile userProfile) throws  UserAlreadyExistException;

    public UserProfile getProfile(String email) throws UserNotFoundException;

    // to put the user personal info
     public UserProfile updateProfile(UserProfile userProfile ,String email) throws UserNotFoundException;


    public void deleteProfile(String email);

    public boolean isUserPresent(String email);


}
