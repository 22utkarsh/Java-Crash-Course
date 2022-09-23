package com.polymorphism;

public class Practice {
	public static void sample(String s) {
		System.out.println("String");
	}
	public static void sample(Object o) {
		System.out.println("Object");
	}
	public static void sample(Integer i) {
		System.out.println("Integer");
	}
	
	
//	public static void main(String[] args) {
////		sample(null);          // CTE : The method sample(String) is ambiguous for the type Practice
//	}
	
	
	
//	public static void main(String[] args) {
//		short s=0;
//		int x =07;
////		int y = 08;     
//		int z =123456;   //error int out of range
//		s+=z;
////		System.out.println(""+x+y+s);
//	}
//	

	
	
//	public static int method() {
//		try {
//			System.out.println("try");
//			return 33/0;
//		}catch(Exception e) {
//			System.out.print("catch");
//			return 11;
//		}finally {
//			System.out.println("finally");
//			return 12;
//		}
//	}
//	
//	public static void main(String[] args) {
//		method();    // o/p : try
//					 //       catchfinally
//	}
	
	
	
//	public static void Test(Exception e) {
//		System.out.println("Exception");
//	}
//	public static void Test(ArithmeticException e) {
//		System.out.println("Arithmetic Exception");
//	}
//	public static void Test(Object e) {
//		System.out.println("object");
//	}
//	public static void main(String[] args) {
//		Test(null);     // arithmetic exception because null pointer exception comes under arithmetic exception
//	}
	
	
	
//	
//	public static void main(String[] args) {
//		int n=2;
//		if(n=2) {    //cannot convert from int to boolean
//			System.out.println("true");
//		}else {
//			System.out.println(false);
//		}
//	}
	
}
