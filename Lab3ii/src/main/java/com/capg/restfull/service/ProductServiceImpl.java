package com.capg.restfull.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.restfull.entities.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	private static List<Product> productList=new ArrayList<>();
	
	static {
		
		Product product1=new Product(101,"Laptop",45678.34);
		Product product2=new Product(102,"IPad",65678.84);
		Product product3=new Product(103,"IPhone",84678.34);
		Product product4=new Product(104,"IPod",1200.99);
		Product product5=new Product(105,"Hard Disk",5000.0);
		Product product6=new Product(106,"Data Cables",2000.15);
		Product product7=new Product(107,"Fit Bit Wrist Band",5000.78);
		Product product8=new Product(108,"Arm Sleeves",500.12);
		Product product9=new Product(109,"Adapter",4000.26);
		Product product10=new Product(110,"Samsung Tab",75678.0);
		Product product11=new Product(234,"DVD",345323.0);
		
		

		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
		productList.add(product6);
		productList.add(product7);
		productList.add(product8);
		productList.add(product9);
		productList.add(product10);
		productList.add(product11);
	}

	@Override
	public Product addProduct(Product product) {
		productList.add(product);
		return product;
	}

	@Override
	public Product getProduct(int productId) {
		Product product=null;
		for(Product p:productList) {
			if(p.getProductId()==productId) {
				product=p;
				break;
			}
		}
		return product;
	}
	

	@Override
	public List<Product> getAllProducts() {
		
		return productList;
	}

}
