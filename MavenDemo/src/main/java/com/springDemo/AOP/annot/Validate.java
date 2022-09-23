package com.springDemo.AOP.annot;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(0)
@Component
public class Validate {
	@Before("execution(* *.*(String))")
	public void convert(JoinPoint args) throws Exception{
		
		try {
			
			for(Object x:args.getArgs()) {
				System.out.println(x.toString().toUpperCase());
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("Cannot convert to uppercase");
		}
	}
}
