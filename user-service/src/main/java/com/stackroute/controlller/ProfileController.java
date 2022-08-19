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

@CrossOrigin("*")
@RestController
@RequestMapping("/myprofile")
public class ProfileController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessagePublisher publisher;

    @Autowired
    private UserRepository userRepository;

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




@GetMapping("/getprofile/{email}")
public ResponseEntity<?> getProfileController(@PathVariable("email") String email) throws Exception {

    Optional<UserProfile> getRTP=this.userService.getProfile(email);
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
