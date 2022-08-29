package com.example.demo.repository;
import java.util.List;

import org.json.simple.JSONObject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Advice;
import com.example.demo.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface AdviceRepository extends MongoRepository<Advice,Long>{
	public List<Advice>findAll();

	

}
