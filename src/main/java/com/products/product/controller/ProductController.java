package com.products.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.product.models.Products;
import com.products.product.repository.ProductRepository;

@RestController
@RequestMapping(value="/api")
public class ProductController {

	 @Autowired
	 ProductRepository productRepository;
	 
	 @GetMapping("/products")
	 public List<Products> listProducts() {
		 return productRepository.findAll();		 
	 }
}
