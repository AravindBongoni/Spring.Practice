package com.Practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DisplayE4 {

	public static void main(String[] args) {
//		ApplicationContext c = new ClassPathXmlApplicationContext("E4.xml");
//		E4 e = (E4) c.getBean("emp1");
//	System.out.println(e);
		
		Resource r = new ClassPathResource("E4.xml");
		BeanFactory f = new XmlBeanFactory(r);
		E4 e = (E4) f.getBean("emp1");
		System.out.println(e);
}
}
