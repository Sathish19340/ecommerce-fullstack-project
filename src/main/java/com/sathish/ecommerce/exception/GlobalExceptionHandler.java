package com.sathish.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleProductNotFound(ProductNotFoundException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(EmailAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleEmailAlreadyExists(
			EmailAlreadyExistsException ex) {
		
		return ex.getMessage();
	}

}
