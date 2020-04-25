package com.capg.spring.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capg.spring.beans.SBU;

public class AppTester {

	public static void main(String[] args) {
		ApplicationContext iocContainer=new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring_config.xml");
		SBU sbu=iocContainer.getBean("sbu",SBU.class);
		System.out.println("SBU Details");
		System.out.println("--------------------------------------");
		
		System.out.println(sbu);
		
	

}}
