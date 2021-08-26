package com.coder.employee.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coder.employee.entities.Employee;
import com.coder.employee.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeResource {
	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "/all")
	public ResponseEntity<List<Employee>> getAllEmployeeDetails() {
		System.out.println("Get All Employees.....");
		List<Employee> emplList = employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(emplList, HttpStatus.OK);
	}

	@PostMapping(path = "/add")
	public ResponseEntity<Boolean> addEmployee(@RequestBody List<Employee> empList) {
		return new ResponseEntity<Boolean>(employeeService.addEmployee(empList),HttpStatus.CREATED);
	}
	@GetMapping(path = "/id/{empId}")
	public ResponseEntity<Employee> getEmployeeByEmpId(@PathVariable String empId){
		
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(empId),HttpStatus.FOUND);
		
	}
	@DeleteMapping(path = "/delete")
	public ResponseEntity<?> deleteEmployee(@RequestParam String empId){
		boolean flag = employeeService.deleteEmployeeById(empId);
		return new ResponseEntity<>(flag, HttpStatus.OK);
	}
	@PutMapping("/update/{empId}")
	public ResponseEntity<String> changeEmployee(@PathVariable String empId,@RequestBody Employee emp){
		System.out.println("Inside update employee 1");
		//Employee updatedEmpInfo  = employeeService.updateEmployee(emp);
		return new ResponseEntity<>("Updated", HttpStatus.OK);
	}
	@GetMapping("/{empId}")
	public ResponseEntity<String> test(@PathVariable String empId){
		System.out.println("Inside update employee 1");
		//Employee updatedEmpInfo  = employeeService.updateEmployee(emp);
		return new ResponseEntity<>("Updated", HttpStatus.OK);
	}
}
