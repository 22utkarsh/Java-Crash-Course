package com.springDemo.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		Arithmetic ob;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AOPContainer.xml");
		ob=(Arithmetic) ctx.getBean("A");
		try {
			System.out.println(ob.add(20.3, 12.3));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
