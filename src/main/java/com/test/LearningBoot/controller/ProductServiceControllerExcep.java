package com.test.LearningBoot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.LearningBoot.exception.ProductNotfoundException;
import com.test.LearningBoot.model.Product;

@RestController
public class ProductServiceControllerExcep {

	 private static Map<String, Product> productRepo = new HashMap<>();
	 static {
		 Product p1=new Product();
		 p1.setId("1");
		 p1.setName("Bike");
		 
		 Product p2=new Product();
		 p2.setId("2");
		 p2.setName("Car");
		 
	 }
	 @PutMapping("/updateproductexcep/{id}")
	 public ResponseEntity<Object> update(@PathVariable("id") String id ,@RequestBody Product product)
	 {
		 if(!productRepo.containsKey(id))
		 
			 throw new ProductNotfoundException();
		
			 productRepo.remove(id);
		      product.setId(id);
		      productRepo.put(id, product);
				return new ResponseEntity<>("updated",HttpStatus.OK); 
		 
	 }
}
