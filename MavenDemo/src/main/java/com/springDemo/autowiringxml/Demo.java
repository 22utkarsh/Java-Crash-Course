package com.springDemo.autowiringxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean2.xml");
		Student student = ctx.getBean("stud1",Student.class);
		System.out.println(student);
	}

}
