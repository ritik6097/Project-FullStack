package com.stackroute;


import com.stackroute.entity.User;
import com.stackroute.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testEmailInDb(){

        String email = "abc@gmail.com";
        User user = userRepository.findByEmail(email);

        assert(user.getEmail().equals(email));
    }

    @Test
    public void testPwd(){
        String email = "xyz@gmail.com";
        String pwd = "xyz123";

        User user = userRepository.findByEmail(email);
        assert(user.getPassword().equals(pwd));

    }
}
