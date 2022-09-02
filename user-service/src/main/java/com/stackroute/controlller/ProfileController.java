package com.stackroute.controlller;


import com.stackroute.custommessage.CustomMessage;
import com.stackroute.dto.ExceptionResponse;
import com.stackroute.exception.UserAlreadyExistException;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.model.UserProfile;
import com.stackroute.rabbitconfig.MessagePublisher;
import com.stackroute.repo.UserRepository;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@CrossOrigin("*")
@RestController
@RequestMapping("/myprofile")
public class ProfileController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessagePublisher publisher;

    @Autowired
    private UserRepository userRepository;



 // this postmapping is used to post the data while registering the user

    @PostMapping("/save")
    public ResponseEntity<?> addProfileController(@RequestBody UserProfile userProfile)  {
        UserProfile saveRTP= null;
        try {
            //rabitmq message publishing
            CustomMessage message= new CustomMessage(userProfile.getEmail(),userProfile.getPassword());
            publisher.publishMessage(message);
            saveRTP = this.userService.addProfile(userProfile);
        }
        catch ( UserAlreadyExistException e)
        {
            return ResponseEntity.ok(new ExceptionResponse("user already exist"));
        }
        return ResponseEntity.ok(saveRTP);
    }


// getting the profile of the user on clicking my profile button n frontend
@GetMapping("/getprofile/{email}")
public ResponseEntity<?> getProfileController(@PathVariable("email") String email) throws Exception {
          UserProfile showProfile =null;
          try{
              showProfile=this.userService.getProfile(email);
          }
          catch (UserNotFoundException e){

          return ResponseEntity.ok( new ExceptionResponse("such user not exist"));

          }
       return ResponseEntity.ok(showProfile);
    }

//    Optional<UserProfile> getRTP=this.userService.getProfile(email);
//    if(getRTP==null){
//       // ExceptionResponse er= new ExceptionResponse();
//        throw new UserNotFoundException("this user is not available !!");
//
//       // return ResponseEntity.ok("user not found");
//    }
//    return ResponseEntity.ok(getRTP);
//
//}

   @PutMapping("/update/{email}")


   public ResponseEntity<?> updateProfileController(@RequestBody UserProfile userProfile,@PathVariable String email) throws UserNotFoundException {
       UserProfile updateRTP=null;
        try {
            updateRTP = this.userService.updateProfile(userProfile, email);
       }
       catch (UserNotFoundException e){
           return ResponseEntity.ok(new ExceptionResponse("such user doesnot exist"));
       }
           return ResponseEntity.ok(updateRTP);
       }




    @DeleteMapping("/deleteprofile/{email}")
    public ResponseEntity <?> deleteProfile(@PathVariable("email") String email){
         this.userService.deleteProfile(email);
         return ResponseEntity.ok("your profile has been deleted successfully");
    }

}
