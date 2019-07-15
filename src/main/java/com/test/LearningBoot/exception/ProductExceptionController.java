package com.test.LearningBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController  {
@ExceptionHandler(value=ProductNotfoundException.class)
public ResponseEntity<Object> exception(ProductNotfoundException notfound)
{
	return new  ResponseEntity<>("product not found",HttpStatus.NOT_FOUND);
}
}
