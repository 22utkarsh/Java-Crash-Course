package com.springDemo.javaAnnot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JContainer {
	
	@Bean("car")
	public Car foo1() {
		return new Car("BMW", new Vehicle(200,4));
	}
	@Bean("bike")
	public Bike foo2() {
		return new Bike("Platina", new Vehicle(120,2));
	}
	@Bean("vehicle")
	public Vehicle foo3() {
		return  new Vehicle(150,4);
	}
	
//	@Bean
//	public Car foo() {
//		return new Car("Auto wired Car", new Vehicle(200,4));
//	}

}
