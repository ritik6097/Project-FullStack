package com.stackroute.repository;
import java.util.List;

import com.stackroute.entity.Advice;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface AdviceRepository extends MongoRepository<Advice,Long>{
	public List<Advice>findAll();

	

}
