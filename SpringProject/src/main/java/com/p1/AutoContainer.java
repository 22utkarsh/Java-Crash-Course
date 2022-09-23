package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoContainer {
	
	Jconfiguration jcon;
	@Autowired
	AutoContainer(Jconfiguration jcon){
		this.jcon=jcon;
	}
	
	@Bean
	public Employee empBean() {
		return new Employee(1,"Virat Kohali",10000,jcon.address(),jcon.deptBean());
	}
}
