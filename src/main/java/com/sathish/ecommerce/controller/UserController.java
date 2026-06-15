package com.sathish.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sathish.ecommerce.dto.LoginRequest;
import com.sathish.ecommerce.entity.User;
import com.sathish.ecommerce.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return service.register(user);
	}
	
	@PostMapping("/login")
	public User login(@RequestBody LoginRequest request) {
		
		return service.login(
				request.getEmail(),
				request.getPassword());
	}

}
