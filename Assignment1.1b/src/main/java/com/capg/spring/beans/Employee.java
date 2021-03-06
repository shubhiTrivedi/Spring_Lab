package com.capg.spring.beans;


import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Emp")
@Scope("singleton")
public class Employee {
	
	@Value("12345")
	private int employeeId;
	
	@Value("Harriet")
	private String employeeName;
	
	@Value("40000")
	private double salary;
	
	@Value("PES-BU")
	private String businessUnit;
	
	@Value("30")
	private int age;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
