package com.stackroute.controller;

import com.stackroute.entity.User;
import com.stackroute.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
//@CrossOrigin
//@RequestMapping("/api/v1")
public class UserLoginController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/hello1")
    public String hello() {
        return "Welcome 1";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hello 2 !!";
    }

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody User user) throws Exception {
        System.out.println(user);

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("invalid username/password");
        }
        return jwtUtil.generateToken(user.getEmail());
    }

    @GetMapping("/google-login")
    public Principal loginwithgoogle(Principal principal){
        return principal;
    }

}
