package com.test.LearningBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.LearningBoot.model.Product;
import com.test.LearningBoot.service.ProductService;

@RestController
public class ProductServiceControllerService {

	@Autowired 
	ProductService productService;
	
	@RequestMapping(value="/getproduct")
	public ResponseEntity<Object> getProducts()
	{
		return new ResponseEntity<>(productService.getProducts(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public ResponseEntity<Object> addprod(@RequestBody Product product)
	{
		productService.createProduct(product);
		return new ResponseEntity<>("added successfully",HttpStatus.OK);
	}
	
	
	
}
