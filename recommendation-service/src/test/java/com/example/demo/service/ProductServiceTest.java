package com.example.demo.service;
import com.example.demo.entity.Product;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.service.ProductService;
import org.json.simple.JSONObject;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProductServiceTest {
	@Autowired
    ProductService productService;
	 Product product = new Product();
	@BeforeAll
    void setUp() {
        product.setBD(1000);
        product.setDed1(200);
        product.setDed2(5000);
        product.setDTC(0);
        product.setEDS(7000);
        product.setGTI1(6000);
        product.setGTI2(0);
        product.setIFD(0);
        product.setIFDS(50000);
        product.setIFS(0);
        product.setIOEL(30000);
        product.setIOHL(35000);
        product.setIPHL(40000);
        product.setIPL(28000);
        product.setMD(0);
        product.setNPS(0);
        product.setOI(0);
        product.setRIR(500);
        product.setTax1(80000);
        product.setTax2(95000);
        productService.saveProduct(product);
    }
	
	 @Test
	    void testFindAlltaxInput() {
	        Assertions.assertFalse(productService.getAllProducts().isEmpty());
	    }
	 @Test
	    void testFindAllAdvices() {
	        Assertions.assertFalse(productService.getAllAdvices().isEmpty());
	    }
	 @Test
	   void testforsaveproduct() {
		 JSONObject response = productService.saveProduct(product);
		 var count = response.size();
		 Assertions.assertTrue(count==7);
		 
	 }

}
