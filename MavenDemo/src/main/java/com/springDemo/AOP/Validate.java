package com.springDemo.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)
public class Validate {
	
	@Before("execution(* *.*(Double,Double))")
	public void check(JoinPoint arg) throws Exception {
		for(Object x : arg.getArgs()) {
			Double y = (Double) x;
			if(y<0) {
				throw new IllegalArgumentException("Negative numbers not allowd");
			}
		}
	}
}
