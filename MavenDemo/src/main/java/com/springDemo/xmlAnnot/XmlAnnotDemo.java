package com.springDemo.xmlAnnot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAnnotDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("XmlAnnot.xml");
		Employee emp = ctx.getBean("emp1",Employee.class);
		System.out.println(emp);
		
		emp = ctx.getBean("emp2",Employee.class);
		System.out.println(emp);
	}
}
