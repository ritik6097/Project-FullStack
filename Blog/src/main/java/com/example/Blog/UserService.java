package com.example.Blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired UserRepository userRepository;
    //add User
    public User addUser(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            return null;
        }
    }

    //get all users
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    //get user by id
    public User getUserById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
    //update user
    public User updateUser(String id,User user){
        User _user = userRepository.findById(id).orElse(null);
        if(_user !=null) {
            _user.setId(user.getId());
            _user.setName(user.getName());
            _user.setTitle(user.getTitle());
            _user.setContent(user.getContent());
             return userRepository.save(_user);
        } else{
            return null;
        }
    }
    //delete user
    public boolean deleteUser(String id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
