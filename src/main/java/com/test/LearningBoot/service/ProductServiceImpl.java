package com.test.LearningBoot.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.test.LearningBoot.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private static Map<String, Product> productRepo = new HashMap<>();
	static
	{
		  Product honey = new Product();
	      honey.setId("1");
	      honey.setName("Honey");
	      productRepo.put(honey.getId(), honey);

	      Product almond = new Product();
	      almond.setId("2");
	      almond.setName("Almond");
	      productRepo.put(almond.getId(), almond);
		
	}
	@Override
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		
		  productRepo.put(product.getId(), product);
	}

	@Override
	public void updateproduct(String id, Product product) {
		// TODO Auto-generated method stub
		productRepo.remove(id);
		product.setId(id);
	    productRepo.put(id,product);
	}

	@Override
	public void deleteproduct(String id) {
		// TODO Auto-generated method stub
		 productRepo.remove(id);
	}

	@Override
	public Collection<Product> getProducts() {
		// TODO Auto-generated method stub
		
		return productRepo.values();
	}

	
}
