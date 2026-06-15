package com.sathish.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sathish.ecommerce.entity.Order;
import com.sathish.ecommerce.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping
	public Order PlaceOrder(@RequestBody Order order) {
		
		return service.placeOrder(order);
	}
	
	@GetMapping("/{userId}")
	public List<Order>getOrders(@PathVariable Long userId){
		
		return service.getOrders(userId);
	}

}
