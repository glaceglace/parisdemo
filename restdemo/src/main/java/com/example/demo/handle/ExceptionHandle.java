package com.example.demo.handle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
	
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public ResponseEntity handle(Exception e){
		return ResponseEntity.noContent().build();
	}

}
