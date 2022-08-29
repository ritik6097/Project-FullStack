package com.stackroute.service;

import com.stackroute.entity.User;
import com.stackroute.exception.UsrAlreadyExistsException;

public interface UserService {

    void saveUser(User user) throws UsrAlreadyExistsException;
}
