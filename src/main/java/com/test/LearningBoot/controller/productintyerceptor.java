package com.test.LearningBoot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.LearningBoot.model.Product;

@RestController
public class productintyerceptor {

	 private static Map<String, Product> productRepo = new HashMap<>();   
	   static {      
	      Product honey = new Product();
	      honey.setId("1");
	      honey.setName("Honey");
	      productRepo.put(honey.getId(), honey);      
	      Product almond = new Product();
	      almond.setId("2");
	      almond.setName("Almond");
	      productRepo.put(almond.getId(), almond);      
	   }
	   @GetMapping("/productstestinterceptor")
	   public ResponseEntity<Object> getall()
	   {
		   return new ResponseEntity<>(productRepo.values(),HttpStatus.OK);
	   }
}
