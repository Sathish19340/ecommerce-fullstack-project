package com.sathish.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.ecommerce.entity.Cart;
import com.sathish.ecommerce.repository.CartRepository;
import java.util.List;

@Service
public class CartService {
	
	@Autowired
	private CartRepository repository;
	
	public Cart addToCart(Cart cart) {
		return repository.save(cart);
	}
	
	public List<Cart>getCartByUser(Long userId){
		return repository.findByUserId(userId);
	}

}
