package com.stackroute.repository;

import com.stackroute.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
    User findByEmail(String email);
}