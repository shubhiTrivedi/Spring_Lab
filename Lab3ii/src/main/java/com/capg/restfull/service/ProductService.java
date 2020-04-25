package com.capg.restfull.service;

import java.util.List;

import com.capg.restfull.entities.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	
	public Product getProduct(int productId);
	
	public List<Product> getAllProducts();

}
