package com.example.demo.controller;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Advice;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAll() {
		List<Product> list = this.productService.getAllProducts();
		System.out.println(list);
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	@GetMapping("/advices")
	public ResponseEntity<List<Advice>> getAllAdvices() {
		List<Advice> list = this.productService.getAllAdvices();
		System.out.println(list);
		return new ResponseEntity<List<Advice>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/saveproduct")
	public ResponseEntity<JSONObject> saveProduct(@RequestBody Product product) {
		// write the logic to save the data into the database.
		System.out.println(product);
		JSONObject mess=  productService.saveProduct(product);
		return new ResponseEntity<JSONObject>(mess, HttpStatus.OK);
	}
	
	
	

}
