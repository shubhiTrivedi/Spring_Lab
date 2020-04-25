package com.capg.restclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class AppController {
	
	@RequestMapping("/showPage")
	public String showPage() {
		return "register-product";
	}
	
	@RequestMapping("/viewPage")
	public String viewPage() {
		return "find-product";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute("product")Product product,ModelMap modelMap) {
		String uri="http://localhost:8093/Lab3ii/products";
		RestTemplate restTemplate=new RestTemplate();
		Product savedProduct=restTemplate.postForObject(uri, product, Product.class);
		modelMap.addAttribute("msg", "Product is added successfully with Id:"+savedProduct.getProductId());
		return "register-product";
		
	}
	
	@RequestMapping("/viewProduct")
	public String getProduct(@RequestParam("productId")int productId,ModelMap map) {
		String uri="http://localhost:8093/Lab3ii/products";
		RestTemplate restTemplate=new RestTemplate();
		Product product=restTemplate.getForObject(uri+"/"+productId, Product.class);
		map.addAttribute("product",product );
		return "show-product";
	}
	
	@RequestMapping("/allProduct")
	public String getAllProduct(ModelMap map) {
		String uri="http://localhost:8093/Lab3ii/products";
		RestTemplate restTemplate=new RestTemplate();
		Product[] products=restTemplate.getForObject(uri, Product[].class);
		map.addAttribute("products",products);
		return "show-product";
	}

}
