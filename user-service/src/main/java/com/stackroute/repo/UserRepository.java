package com.stackroute.repo;

import com.stackroute.model.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.Optional;

public interface UserRepository extends MongoRepository<UserProfile, String> {



      Optional<UserProfile>  findByEmail(String email);

       void deleteByEmail(String email);

    //@Query(value = "select * from user_profile where email=:email")
    // @Query(value = "update  user_profile set firstName=:firstName and where email=:email")
   // UserProfile updateProfileUser(String firstname,String lastname ,String dob, String gender, String con);
}
