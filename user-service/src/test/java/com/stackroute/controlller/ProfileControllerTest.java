package com.stackroute.controlller;

import com.stackroute.model.UserProfile;
import com.stackroute.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(MockitoExtension.class)
class ProfileControllerTest {

@Mock
private UserService userService;


@InjectMocks
private ProfileController profileController;


@Autowired
private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(profileController).build();
    }
    @Test
    public void givenNewUserWhenPostThenReturnUserJSON() throws Exception {
        UserProfile user = new UserProfile("hello@gmail.com", "Raju");
        when(userService.addProfile(any())).thenReturn(user);
        mockMvc.perform(post("/myprofile/save").contentType(MediaType.APPLICATION_JSON).content(
                        "{\"email\":\"hello@gmail.com\",\"password\":\"123\"}"))
                .andExpect(status().isCreated()).andExpect(jsonPath("$.email").value("hello@gmail.com"));
    }

}