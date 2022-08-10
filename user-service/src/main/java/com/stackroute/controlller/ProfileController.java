package com.stackroute.controlller;

import com.stackroute.model.UserProfile;
import com.stackroute.repo.UserRepository;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myprofile")
public class ProfileController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> addProfile(@RequestBody UserProfile userProfile){
        UserProfile save= this.userService.addProfile(userProfile);
        return ResponseEntity.ok(save);

    }
@GetMapping("/getprofile/{email}")
public ResponseEntity<?> getProfile(@PathVariable("email") String email){
    UserProfile get=this.userService.getProfile(email);
    return ResponseEntity.ok(get);

}
    @PutMapping("/update")
    public ResponseEntity<?> updateProfile(@RequestBody UserProfile userProfile ){

        UserProfile update=this.userService.updateProfile(userProfile);
        return ResponseEntity.ok(update);
    }
}
