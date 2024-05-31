package com.Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("E1.xml");
		E1 e = (E1) c.getBean("emp1");
		System.out.println(e);
	}
	
}
