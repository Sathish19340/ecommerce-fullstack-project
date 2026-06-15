package com.sathish.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	Optional<User>findByEmail(String email);

}
