package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Jconfiguration {
	Department dept;
	Address add;
	
	@Autowired
	@Bean
	public Department deptBean() {
		this.dept=new Department(1,"Administration","admin",20,4);
		return this.dept;
	}
	
	@Autowired
	@Bean
	public Address address() {
		this.add = new Address("pune","maharashtra","Shivaji",2,411005);
		return this.add;
	}

}
