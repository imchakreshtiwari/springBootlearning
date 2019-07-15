package com.test.LearningBoot.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.LearningBoot.model.Product;

@RestController
public class ProductPost {
    private static Map<String, Product> productRepo = new HashMap<>();
	@PostMapping("/insertyproduct")
	public ResponseEntity<Object> insertProduct(@RequestBody Product product)
	{
		productRepo.put(product.getId(), product);
		return new ResponseEntity<>(productRepo.values(),HttpStatus.OK);
		
	}
}
