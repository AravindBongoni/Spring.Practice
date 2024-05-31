package com.Practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DisplayEmp {

	public static void main(String[] args) {
		//Use Application Context
//		ApplicationContext c = new ClassPathXmlApplicationContext("EmpDetails.xml");
//		EmpDetails e1 = (EmpDetails)c.getBean("emp1");
//		EmpDetails e2 = (EmpDetails)c.getBean("emp2");
		//System.out.println(e1);
//		System.out.println(e2);
		
//		Use Bean Factory
		Resource r = new ClassPathResource("EmpDetails.xml");
		BeanFactory f = new XmlBeanFactory(r);
		EmpDetails emp = (EmpDetails) f.getBean("empl");
		EmpDetails emp2 = (EmpDetails) f.getBean("emp2");
		System.out.println(emp);
		System.out.println(emp2);
//		
	}

}
