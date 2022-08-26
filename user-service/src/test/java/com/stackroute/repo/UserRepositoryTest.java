package com.stackroute.repo;

import com.stackroute.model.UserProfile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

@Autowired
private  UserRepository userRepository;

    @Test
    public void givenNewUserWhenSavedThenReturnUser() {
        UserProfile user = new UserProfile("hello@gmail.com", "Welcome");
        UserProfile adddeduser = userRepository.save(user);
        assertEquals(user.getEmail(), adddeduser.getEmail(),
                "New User should be saved and the same should be returned");
    }

    @Test
    public void givenInValidUserIdThenReturnEmptyOptional() {
        assertTrue(userRepository.findByEmail("hello1@gmail.com").isEmpty());
    }

    @Test
    public void givenValidUserIdThenReturnUserOptional() {
        UserProfile user = new UserProfile("hello@gmail.com", "Welcome");
        userRepository.save(user);
        assertTrue(userRepository.findByEmail("hello@gmail.com").isPresent());
    }

}