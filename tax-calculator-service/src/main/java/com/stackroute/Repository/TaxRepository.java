package com.stackroute.Repository;

import com.stackroute.TaxModel.CalculatedTax;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface TaxRepository extends MongoRepository<CalculatedTax,Long> {
}
