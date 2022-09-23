package com.polymorphism;

public class AdditionOfTwo {
	
	// Method Overloading
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
//	public float add(int num1, int num2) {  // show error coz same signature ; returntype and modifier is not part of returntype
//		return num1+num2;
//	}
	
	
	public float add(float num1, float num2) {
		return num1+num2;
	}
	
	public float add(float num1, int num2) {
		return num1+num2;
	}
	
	public float add(int num1, float num2) {
		return num1+num2;
	}
	
	// static binding or dispatch technique
	
	public String add(String num1 , String num2) {
		return num1+num2;   //it concate it;
	}
	
}
