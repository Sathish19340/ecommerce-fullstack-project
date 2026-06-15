package com.sathish.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
