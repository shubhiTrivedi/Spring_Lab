package com.capg.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.spring.beans.Employee;

public class AppTester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext iocContainer=new AnnotationConfigApplicationContext("com.capg.spring");
		Employee e=iocContainer.getBean("Empl",Employee.class);
		System.out.println("Employee Details");
		System.out.println("---------------------------------");
		System.out.println(e);
		

	}

}
