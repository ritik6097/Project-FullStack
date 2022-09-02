package com.stackroute.repository;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.stackroute.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface  ProductRepository extends MongoRepository<Product,Long> {
	public List<Product>findAll();

	

}
