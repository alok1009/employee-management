package com.coder.employee.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder.employee.dtos.response.Response;

@RestController(value = "/employee")
public class EmployeeResource {
	@GetMapping
	public ResponseEntity getAllEmployeeDetails(){
		//Response response = new Response();
		//response.setResponse("Hi");
		System.out.println("Get All Employees.....");
		return new ResponseEntity("Hi there", HttpStatus.OK);
	}
}
