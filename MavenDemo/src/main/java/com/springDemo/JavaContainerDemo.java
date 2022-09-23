package com.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaContainerDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaContainer.class);
		Holiday obj = ctx.getBean("no_args",Holiday.class);
		obj.display();
		Holiday obj2 = ctx.getBean("args",Holiday.class);
		obj2.display();
		Holiday obj3 = ctx.getBean("get_set",Holiday.class);
		obj3.display();
		
	}
}
