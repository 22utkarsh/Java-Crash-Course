package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaContainer {
	
	@Bean("no_args")
	public Holiday foo1() {
		return new Holiday();
	}
	
	@Bean("args")
	public Holiday foo2() {
		return new Holiday("Gandhi Jayanti","2 October");
	}
	
	@Bean("get_set")
	public Holiday foo3() {
		Holiday obj = new Holiday();
		obj.setHolidayName("X-Mas");
		obj.setDate("25th December");
		return obj;
	}
}
