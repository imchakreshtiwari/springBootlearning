package com.test.LearningBoot.service;

import java.util.Collection;

import com.test.LearningBoot.model.Product;

public interface ProductService {
	public abstract void createProduct(Product product);
	public abstract void updateproduct(String id,Product product);
	public abstract void deleteproduct(String id);
	public abstract Collection<Product> getProducts();
	
}
