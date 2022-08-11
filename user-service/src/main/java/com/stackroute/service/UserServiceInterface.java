package com.stackroute.service;

import com.stackroute.model.UserProfile;

public interface UserServiceInterface {
    public UserProfile addProfile(UserProfile userProfile);
    public UserProfile getProfile(String email);
    public UserProfile updateProfile(UserProfile userProfile ,String email);
}
