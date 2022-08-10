package com.stackroute.repo;

import com.stackroute.model.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface UserRepository extends MongoRepository<UserProfile, String> {
    UserProfile findByEmail(String email);
}
