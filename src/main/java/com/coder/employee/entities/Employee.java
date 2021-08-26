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
	public int getRowId() {
		return rowId;
	}
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getCurrentSalary() {
		return currentSalary;
	}
	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}

}
