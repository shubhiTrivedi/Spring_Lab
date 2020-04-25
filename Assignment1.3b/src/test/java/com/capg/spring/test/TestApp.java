package com.capg.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.capg.spring.beans.SBU;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext iocContainer=new AnnotationConfigApplicationContext("com.capg.spring");
		SBU s=iocContainer.getBean("sbu",SBU.class);
		System.out.println("SBU Details");
		System.out.println("---------------------------------");
		System.out.println(s);

	}

}
