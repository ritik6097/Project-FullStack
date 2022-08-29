//package com.stackroute.Services;
//
//import com.stackroute.Repository.UserRepository;
//import com.stackroute.TaxModel.Tax;
//import com.stackroute.Services.TaxService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class TaxServiceTest {
//
//    @Mock
//    UserRepository repository;
//
//    @InjectMocks
//    TaxService service;
//
//    @Test
//    public void addNew(Tax tax) throws IllegalStateException {
//        Optional<Tax> movie = repository.findById(((Tax) tax).getId());
//        if (movie.isPresent()) {
//            throw new IllegalStateException();
//        } else {
//            repository.save(tax);
//        }
//
//
//    }
//}