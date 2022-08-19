package com.stackroute.service;

import com.stackroute.exception.UserAlreadyExistException;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.model.UserProfile;

import java.util.Optional;

public interface UserServiceInterface {
    public UserProfile addProfile(UserProfile userProfile) throws  UserAlreadyExistException;
    public Optional<UserProfile> getProfile(String email) throws UserNotFoundException;
    public UserProfile updateProfile(UserProfile userProfile ,String email);
    public void deleteProfile(String email);
    public boolean isUserPresent(String email);
}
