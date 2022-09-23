package com.springDemo.javaAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutowireCont {
	@Autowired
	JContainer jCon;
	
//	@Bean("auto")
//	public Car foo() {
//		Car ob = jCon.foo();
//		return ob ;
//	}
}
