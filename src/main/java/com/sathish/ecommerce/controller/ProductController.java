package com.sathish.ecommerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.sathish.ecommerce.entity.Product;
import com.sathish.ecommerce.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<Product>getProducts(){
		return service.getAllProducts();
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id) {
		return service.getProductById(id);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(
		@PathVariable Long id,
		@RequestBody Product product) {
	return service.updateProduct(id, product);
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Long id) {
		service.deleteProduct(id);
		return "Product Deleted Successfully";
	}
	
	
	

}
