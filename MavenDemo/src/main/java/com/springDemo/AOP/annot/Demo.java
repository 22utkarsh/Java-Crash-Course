package com.springDemo.AOP.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaContainer.class);
		ToUpper obj = ctx.getBean(ToUpper.class);
		obj.setString("Utkarsh");
		System.out.println(obj.getString());
		
	}
}
