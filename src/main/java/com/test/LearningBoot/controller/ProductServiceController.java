package com.test.LearningBoot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.LearningBoot.model.Product;

@RestController
public class ProductServiceController {

	private static Map<String, Product> productrepo = new HashMap<String,Product>();
	static
	{
		Product honey=new Product();
		honey.setId("1");
		honey.setName("Honey");
		productrepo.put(honey.getId(), honey);
		
		Product car=new Product();
		car.setId("2");
		car.setName("Bolero");
		productrepo.put(car.getId(), car);
	}
	
	@GetMapping("/products")
	public ResponseEntity<Object> getAll()
	{
		return new  ResponseEntity<>(productrepo.values(),HttpStatus.OK);
		
	}
	
}
