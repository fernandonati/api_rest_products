package com.products.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	 	 
	 @GetMapping("/products/{id}")
	 public Products returnProduct(@PathVariable(value="id") long id) {
		 return productRepository.findById(id);		 
	 }
	 	 
	 @PostMapping("/products")
	 public Products InsertProduct(@RequestBody Products products) {
		 return productRepository.save(products);
	 }
	 
	 @DeleteMapping("/products")
	 public void DeleteProuct(@RequestBody Products products) {		 
		 productRepository.delete(products);
	 }
	 
	 @PutMapping("/products")
	 public Products UpdateProduct(@RequestBody Products products) {
		 return productRepository.save(products);
	 }
	 
	 
}
