package com.springDemo.javaAnnot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoJCont {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JContainer.class);
		Car car = ctx.getBean("car",Car.class);
		System.out.println(car);
		
		Bike bike = ctx.getBean("bike",Bike.class);
		System.out.println(bike);
		
		Vehicle veh = ctx.getBean("vehicle",Vehicle.class);
		System.out.println(veh);
		
		
//		ApplicationContext context =
//			    new AnnotationConfigApplicationContext(AutowireCont.class);
//		Car obj = context.getBean("auto",Car.class);
//		System.out.println(obj);
	}
}
