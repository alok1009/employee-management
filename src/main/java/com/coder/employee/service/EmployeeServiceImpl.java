package com.coder.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coder.employee.entities.Employee;
import com.coder.employee.exception.EmployeeException;
import com.coder.employee.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public boolean addEmployee(List<Employee> empList) {
		List<Employee> savedList = null;
		if (!empList.isEmpty()) {
			savedList = employeeRepo.saveAll(empList);
		}
		if (savedList.equals(empList))
			return true;
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(String empId) throws EmployeeException {
		Employee employee = null;
		// try {
		if (employeeRepo.findByEmpId(empId).isPresent())
			employee = employeeRepo.findByEmpId(empId).get();
		else
			throw new EmployeeException("EMP404", "Data not Found");
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		return employee;
	}

	@Override
	public boolean deleteEmployeeById(String empId) {
		if (empId.isEmpty() || empId.length() == 0)
			throw new EmployeeException("EMP401", "No Id provided for deletion");
		employeeRepo.deleteByEmpId(empId);
		if (employeeRepo.findByEmpId(empId).isPresent()) {
			return false;
		}
		return true;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		System.out.println("Inside update employee");
		Employee e = employeeRepo.findByEmpId(emp.getEmpId())
				.orElseThrow(() -> new EmployeeException("EMP404", "Employee Not found for update"));
		e.setDob(emp.getDob());
		final Employee employee = employeeRepo.save(e);
		return employee;
	}

}
