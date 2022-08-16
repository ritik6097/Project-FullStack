package com.stackroute.Repository;

import com.stackroute.TaxModel.Tax;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface UserRepository extends MongoRepository<Tax,Long> {
    Optional<Tax> findTaxById(Long id);
}
