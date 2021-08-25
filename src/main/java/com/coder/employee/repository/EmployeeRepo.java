/**
 * 
 */
package com.coder.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.employee.entities.Employee;

/**
 * @author alokr
 *
 */
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
