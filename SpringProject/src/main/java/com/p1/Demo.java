package com.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AutoContainer.class);
		Employee obj = ctx.getBean(Employee.class);
		System.out.println(obj);
		
	}
}
