package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Product;
@Repository
public interface  ProductRepository extends CrudRepository<Product,Long> {
	public List<Product>findAll();

	

}
