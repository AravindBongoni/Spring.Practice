 package com.Practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DisplayStudent {

	public static void main(String[] args) {
		//using Application Context
//		ApplicationContext c = new ClassPathXmlApplicationContext("EmpDetails.xml");
//		Student e1 = (Student)c.getBean("std1");
//		Student e2 = (Student)c.getBean("std2");
//		System.out.println(e1);
//		System.out.println(e2);
//		
		// Using Bean Factory
		Resource r = new ClassPathResource("EmpDetails.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Student s1 = (Student)f.getBean("std1");
		Student s2 = (Student)f.getBean("std2");
		System.out.println(s1);
		System.out.println(s2);

	}

}
