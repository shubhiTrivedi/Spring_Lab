package com.capg.restfull.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capg.restfull.entities.Product;


import com.capg.restfull.service.ProductService;

@RestController

public class ProductController {
	
	@Autowired
	private ProductService productService;
	

	@PostMapping(value="/products" ,consumes= {"application/json"},produces= {"application/json"})
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	

	@GetMapping(value="/products/{productId}", produces= {"application/json"})
	public Product getProduct(@PathVariable("productId") int productId){
		
		
		Product product= productService.getProduct(productId);
		return product;
		
	}
	
	@GetMapping(value="/products", produces= {"application/json"})
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
		
	

}
