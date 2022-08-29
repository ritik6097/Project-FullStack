package com.example.Blog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/blog")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        if (users == null || users.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);

        } else {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String userId) {
        User user = userService.getUserById(userId);
        if (user == null) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);

        } else {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }

    @PostMapping(value="/post")
    public ResponseEntity<User> getUserById(@RequestBody User user) {
        User CreatedUser =  userService.addUser(user);
        if (CreatedUser == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        } else {
            return new ResponseEntity<>(CreatedUser, HttpStatus.CREATED);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String userId,@RequestBody User user) {
        User updatedUser = userService.updateUser(userId, user);
        if (updatedUser == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        } else {
            return new ResponseEntity<>(updatedUser, HttpStatus.CREATED);
        }
    }
      @DeleteMapping("/{id}")
       public ResponseEntity<HttpStatus> deleteUserId(@PathVariable("id") String userId){
       if(userService.deleteUser(userId)){
            return  new ResponseEntity<>(HttpStatus.OK);
          }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
          }
    }
}

