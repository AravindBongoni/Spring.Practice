package com.Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayE3 {

	public static void main(String[] args) {
		// Using Application
		ApplicationContext c = new ClassPathXmlApplicationContext("EmpDetails.xml");
		E3 e = (E3) c.getBean("emp3");
		
		System.out.println(e);
		
		
	}

}
