package com.products.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.product.models.Products;


public interface ProductRepository extends JpaRepository<Products,Long> {

}
