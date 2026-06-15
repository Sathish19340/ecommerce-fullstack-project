package com.sathish.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sathish.ecommerce.entity.User;
import com.sathish.ecommerce.exception.EmailAlreadyExistsException;
import com.sathish.ecommerce.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public User register(User user) {
		if(repository.findByEmail(user.getEmail()).isPresent()) {
			throw new EmailAlreadyExistsException("Email already exists");
		}
		user.setPassword(
				passwordEncoder.encode(user.getPassword()));
		return repository.save(user);
	}
	
	public User login(String email,String password) {
		
		User user=repository.findByEmail(email).orElse(null);
		if(user!=null && passwordEncoder.matches(password,user.getPassword())) {
			return user;
		}
		return null;
	}

}
