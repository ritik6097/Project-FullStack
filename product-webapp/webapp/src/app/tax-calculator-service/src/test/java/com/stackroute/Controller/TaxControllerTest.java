//package com.stackroute.Controller;
//
//import com.stackroute.Services.TaxService;
//import com.stackroute.TaxModel.Tax;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.stubbing.OngoingStubbing;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MockMvcBuilder;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.List;
//
//import static org.assertj.core.api.BDDAssumptions.given;
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@ExtendWith(MockitoExtension.class)
//public class TaxControllerTest {
//
//    @Mock
//    private TaxService service;
//
//    @InjectMocks
//    private TaxController controller;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//
//    @BeforeEach
//    public void setUp(){
//        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
//    }
//    @Test
//    public void shouldFetchAllUsers() throws Exception {
//
//        given(service.getDetail()).willReturn(List<Tax>);
//
//        this.mockMvc.perform(get("/api/users"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.size()", is(userList.size())));
//    }
//}