package com.coder.employee.service;

import java.util.List;

import com.coder.employee.entities.Employee;
import com.coder.employee.exception.EmployeeException;

public interface EmployeeService {

	public boolean addEmployee(List<Employee> empList);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(String empId);

	public boolean deleteEmployeeById(String empId) throws EmployeeException;

	public Employee updateEmployee(Employee emp);
}
