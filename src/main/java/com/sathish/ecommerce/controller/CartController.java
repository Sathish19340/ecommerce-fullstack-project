package com.sathish.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sathish.ecommerce.entity.Cart;
import com.sathish.ecommerce.service.CartService;
import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")
public class CartController {
	
	@Autowired
	private CartService service;
	
	@PostMapping
	public Cart addToCart(@RequestBody Cart cart) {
		System.out.println("UserId="+cart.getUserId());
		System.out.println("ProductId="+cart.getProductId());
		System.out.println("Quantity="+cart.getQuantity());	
		
		return service.addToCart(cart);
	}
	
	@GetMapping("/{userId}")
	public List<Cart> getCart(@PathVariable Long userId){
		return service.getCartByUser(userId);
	}

}
