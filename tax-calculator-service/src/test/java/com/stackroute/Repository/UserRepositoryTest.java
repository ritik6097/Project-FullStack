package com.stackroute.Repository;

import com.stackroute.TaxModel.Tax;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    public void givenNewUserWhenSaveReturnUser(){
        Tax tax=new Tax(1L,1000.00);
        Tax addedNewDetails=repository.save(tax);
        assertEquals(tax.getIFS(),addedNewDetails.getIFS());
    }

    @Test
    public void givenNewUserThenReturnUserOptional(){
        Tax tax=new Tax(1L,1000.00);
        repository.save(tax);
        assertTrue(repository.findById(1L).isPresent());
    }

    @Test
    public void givenValidUserIdThenReturnEmptyOptional(){
        Tax tax=new Tax(1L,1000.00);
        repository.save(tax);
        assertTrue(repository.findById(106L).isEmpty());
    }
}