package com.stackroute.controlller;


import com.stackroute.dto.ExceptionResponse;
import com.stackroute.exception.UserAlreadyExistException;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.model.UserProfile;
import com.stackroute.repo.UserRepository;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping("/myprofile")
public class ProfileController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> addProfileController(@RequestBody UserProfile userProfile) throws Exception {

         if (this.userService.isUserPresent(userProfile.getEmail())) {
         // throw new UserAlreadyExistException("user already exist");
         return ResponseEntity.ok(new ExceptionResponse("user already exist"));

     }

       UserProfile saveRTP= this.userService.addProfile(userProfile);
        return ResponseEntity.ok(saveRTP);

    }
@GetMapping("/getprofile/{email}")
public ResponseEntity<?> getProfileController(@PathVariable("email") String email) throws Exception {

    UserProfile getRTP=this.userService.getProfile(email);
    if(getRTP==null){
       // ExceptionResponse er= new ExceptionResponse();
        throw new UserNotFoundException("this user is not available !!");

       // return ResponseEntity.ok("user not found");
    }
    return ResponseEntity.ok(getRTP);

}
    @PutMapping("/update/{email}")
    public ResponseEntity<?> updateProfileController(@RequestBody UserProfile userProfile,@PathVariable String email){

        UserProfile updateRTP=this.userService.updateProfile(userProfile,email);
        return ResponseEntity.ok(updateRTP);
    }
    @DeleteMapping("/deleteprofile/{email}")
    public ResponseEntity <?> deleteProfile(@PathVariable("email") String email){
         this.userService.deleteProfile(email);
         return ResponseEntity.ok("your profile has been deleted successfully");
    }

}
