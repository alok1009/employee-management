/**
 * 
 */
package com.coder.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coder.employee.entities.Employee;

/**
 * @author alokr
 *
 */
@Repository
@Transactional
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	public Optional<Employee> findByEmpId(String empId);
	public void deleteByEmpId(String empId);
}
