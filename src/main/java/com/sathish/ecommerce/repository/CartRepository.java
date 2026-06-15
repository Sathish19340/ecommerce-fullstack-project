package com.sathish.ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.ecommerce.entity.Cart;

public interface CartRepository extends JpaRepository<Cart,Long>{
	List<Cart>findByUserId(Long userId);
}
