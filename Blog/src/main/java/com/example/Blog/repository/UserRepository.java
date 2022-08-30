package com.example.Blog.repository;

import com.example.Blog.Modal.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User getUserById(String id);
}
