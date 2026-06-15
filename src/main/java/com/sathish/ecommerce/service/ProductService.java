package com.sathish.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.ecommerce.entity.Product;
import com.sathish.ecommerce.exception.ProductNotFoundException;
import com.sathish.ecommerce.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product>getAllProducts(){
		return repository.findAll();
	}
	
	public Product saveProduct(Product product){
		return repository.save(product);	
	}
	
	public Product getProductById(Long id) {
		return repository.findById(id).orElseThrow(()->
		new ProductNotFoundException("Product not found with id:"+id));
	}
	public Product updateProduct(Long id,Product product) {
		Product existing=repository.findById(id).orElse(null);
		
		if(existing!=null) {
			existing.setName(product.getName());
			existing.setPrice(product.getPrice());
			existing.setQuantity(product.getQuantity());
			existing.setImageUrl(product.getImageUrl());
			
			return repository.save(existing);
		}
		return null;
	}
	public void deleteProduct(Long id) {
		repository.deleteById(id);
	}


}
