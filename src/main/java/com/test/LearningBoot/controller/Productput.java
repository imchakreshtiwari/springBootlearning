package com.test.LearningBoot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.LearningBoot.model.Product;

@RestController
public class Productput {
	 private static Map<String, Product> productRepo = new HashMap<>();
@PutMapping("/updateproduct/{id}")
public ResponseEntity<Object> updateProduct(@PathVariable("id") String id,@RequestBody Product product)
{
	productRepo.remove(id);
	product.setId("3");
	productRepo.put(product.getId(), product);
	return new ResponseEntity<>("updasted successfully",HttpStatus.OK);
	
}
}
