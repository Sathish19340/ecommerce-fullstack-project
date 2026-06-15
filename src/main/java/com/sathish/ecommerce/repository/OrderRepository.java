package com.sathish.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.ecommerce.entity.Order;

public interface OrderRepository  extends JpaRepository<Order,Long>{
	
	List<Order>findByUserId(Long userId);
	
}