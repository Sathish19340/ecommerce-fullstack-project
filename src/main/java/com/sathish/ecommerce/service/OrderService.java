package com.sathish.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.ecommerce.entity.Order;
import com.sathish.ecommerce.repository.OrderRepository;
import java.util.List;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public Order placeOrder(Order order) {
		
		order.setStatus("PLACED");
		
		return repository.save(order);
	}
	 public List<Order>getOrders(Long userId){
		 
		 return repository.findByUserId(userId);
	 }

}
