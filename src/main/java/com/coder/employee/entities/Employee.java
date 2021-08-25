package com.coder.employee.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee_Details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROWID")
	private int rowId;
	@Column(name = "EMPID", unique = true)
	private String empId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DEPARTMENT")
	private String department;
	@Column(name = "DATEOFJOINING")
	private Date joiningDate;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "SALARY")
	private double currentSalary;

}
