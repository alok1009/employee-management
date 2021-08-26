package com.coder.employee.exception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(EmployeeException.class)
	
	public ResponseEntity<Object> handleEmployeeNotFound(EmployeeException ex) {
		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("statusCode", ex.getCode());
		body.put("msg", ex.getMsg());
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);

	}
	public ResponseEntity<Object> handleEmployeeIdInput(EmployeeException ex){
		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("statusCode", ex.getCode());
		body.put("msg", ex.getMsg());
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}
}
