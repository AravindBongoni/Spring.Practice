package com.Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("EmpDetails.xml");
		E2 e = (E2) c.getBean("emp1");
		E2 e1 = (E2) c.getBean("emp2");
		System.out.println(e);
		System.out.println(e1);
	}

}
