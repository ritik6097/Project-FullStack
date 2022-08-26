package com.stackroute.service;

import com.stackroute.exception.UserAlreadyExistException;
import com.stackroute.model.UserProfile;
import com.stackroute.repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
  @Mock
  private UserRepository userRepository;

  @InjectMocks
  UserService userService;

  @Test
  public void givenNewUserWhenSavedShouldReturnUser() throws UserAlreadyExistException {
    UserProfile user = new UserProfile("hello@gmail.com", "Welcome");
    Optional<UserProfile> optionalUser = Optional.empty();
    when(userRepository.findByEmail("hello@gmail.com")).thenReturn(optionalUser);
    UserProfile addedUser = userService.addProfile(user);
    verify(userRepository, times(1)).findByEmail("hello@gmail.com");
    verify(userRepository, times(1)).save(user);
  }
  @Test
  public void givenDuplicateUserWhenSavedShouldThrowException() throws UserAlreadyExistException {
    UserProfile user = new UserProfile("hello@gmail.com", "Welcome");
    Optional<UserProfile> optionalUser = Optional.of(user);
    when(userRepository.findByEmail("hello@gmail.com")).thenReturn(optionalUser);
    assertThrows(UserAlreadyExistException.class, () -> {
      userService.addProfile(user);
    });
    verify(userRepository, times(1)).findByEmail("hello@gmail.com");
    verify(userRepository, times(0)).save(user);
  }
}