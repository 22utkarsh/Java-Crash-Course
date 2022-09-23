package com.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		Holiday obj;
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
		obj=context.getBean("h1",Holiday.class);
		obj.display();
		
		obj=context.getBean("h2",Holiday.class);
		obj.display();
		
		obj=context.getBean("h3",Holiday.class);
		obj.display();
	}
}
