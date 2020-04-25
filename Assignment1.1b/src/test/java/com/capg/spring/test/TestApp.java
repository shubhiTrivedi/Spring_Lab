package com.capg.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.spring.beans.Employee;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext iocContainer=new AnnotationConfigApplicationContext("com.capg.spring");
		Employee e=iocContainer.getBean("Emp",Employee.class);
		System.out.println("Employee ID: "+e.getEmployeeId()+"\nEmployee Name: "+e.getEmployeeName()+"\nSalary: "+e.getSalary()+"\nEmployee BU: "+e.getBusinessUnit()+"\nEmployee Age: "+e.getAge());
		

	}

}
