package com.capg.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.beans.Employee;

public class AppTester {

	public static void main(String[] args) {
		ApplicationContext iocContainer=new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring_config.xml");
		Employee emp=iocContainer.getBean("employee",Employee.class);
		System.out.println("Employee ID: "+emp.getEmployeeId()+"\n"+"Employee Name: "+emp.getEmployeeName()+"\n"+"Employee Salary: "+emp.getSalary()+"\n"+"Employee BU: "+emp.getBusinessUnit()+"\n"+"Employee Age: "+emp.getAge());
	
	}

}
