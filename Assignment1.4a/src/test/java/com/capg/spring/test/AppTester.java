package com.capg.spring.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.beans.Employee;
import com.capg.spring.beans.EmployeeDetails;

public class AppTester {

	public static void main(String[] args) {
		
		
		ApplicationContext iocContainer=new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring_config.xml");
		EmployeeDetails ed=iocContainer.getBean("empDet",EmployeeDetails.class);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		int id=sc.nextInt();
		System.out.println("Employee Info:");
		Employee e=new Employee();
		
		
		
		for(int i=0;i<ed.getEmp().size();i++) {
			Employee tester=ed.getEmp().get(i);
			
			if(tester.getEmployeeId()==id) {
				
				System.out.println(tester.getEmployeeId());
				System.out.println(tester.getEmployeeName());
				System.out.println(tester.getSalary());
				System.out.println(tester.getAge());
				break;
			}
			else {
				System.out.println("Id not present");
				break;
			}
			
		}
		
		
		
		
		
	

}}
