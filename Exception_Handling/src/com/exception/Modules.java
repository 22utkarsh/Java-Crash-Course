package com.exception;

public class Modules {
	
	public int divide(int a,int b) throws ArithmeticException{
		
		try {
			return a/b;
		} 
		finally {
			System.out.println("Finally Excecuted!");
		}
		
		
//		System.out.println("Finally Excecuted!"); // unreachable code
	}
}
