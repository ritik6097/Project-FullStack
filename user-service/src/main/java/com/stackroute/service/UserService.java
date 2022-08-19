package com.stackroute.service;


import com.stackroute.exception.UserAlreadyExistException;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.model.UserProfile;

import com.stackroute.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService  implements UserServiceInterface{
    @Autowired
    private UserRepository userRepository;

   // @Autowired
  //  private Producer producer;

    @Override
    public UserProfile addProfile( UserProfile userProfile) throws  UserAlreadyExistException {
     // rbbitmq
        //            EmailDTO emailDto = new EmailDTO();
        //            emailDto.setEmail(userProfile.getEmail());
        //            producer.sendMessageToRabbitMq(emailDto);a

        Optional<UserProfile> get=this.userRepository.findByEmail(userProfile.getEmail());

        if (get.isPresent()){
            throw new UserAlreadyExistException("user already exist");
        }

        UserProfile save=this.userRepository.save(userProfile);

        return save;
    }


@Override
    public Optional<UserProfile> getProfile(String email) throws UserNotFoundException {
        Optional<UserProfile> get=this.userRepository.findByEmail(email);
        if (!get.isPresent()){
         throw new UserNotFoundException("user not found");
        }

        return get;
    }
@Override
    public UserProfile updateProfile(UserProfile userProfile, String email){

        Optional<UserProfile> save1=this.userRepository.findByEmail(email);
        UserProfile save=userProfile;
        save.setFirstName(userProfile.getFirstName());
        save.setLastName(userProfile.getLastName());
        save.setDob(userProfile.getDob());
        save.setGender(userProfile.getGender());
        save.setContactNumber(userProfile.getContactNumber());
        UserProfile updated=this.userRepository.save(save);
        return updated;
    }
    @Override
    public void deleteProfile(String email){
          this.userRepository.deleteByEmail(email);
    }
    @Override
    public boolean isUserPresent(String email){
       Optional<UserProfile> userfound =this.userRepository.findByEmail(email);
       if(userfound==null)

       {
           return false;
       }
       return true;
    }
}
