package com.example.Blog.Repo;


import com.example.Blog.Modal.User;
import com.example.Blog.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataMongoTest
public class TestRepo {


    @Autowired
    private UserRepository userRepository;

    private User getUser;

    //
//
    @BeforeEach
    void setUp() {
        getUser = new User();
        getUser.setId("1");
        getUser.setName("vinneth");
        getUser.setTitle("");
        getUser.setContent("");

    }

    @AfterEach
    void tearDown() {

        getUser = null;
    }


    @Test
    public void givenIdThenShouldReturnRespectiveUser() throws Exception {

        User newUser = userRepository.save(getUser);
        User BloguserList = userRepository.getUserById(getUser.getId());
        Assertions.assertEquals(getUser.getId(), BloguserList.getId());

    }
}

