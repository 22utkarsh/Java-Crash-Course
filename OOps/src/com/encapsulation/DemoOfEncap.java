package com.encapsulation;

public class DemoOfEncap {
	public static void main(String[] args) {
		Encapsulation encapObj = new Encapsulation();
		
		//encapObj.f1();  // it is private method hence showing the error
		
		encapObj.f2();   
		
		encapObj.f3();
		
		encapObj.f4();
		
	   //System.out.println("a1 ="+encapObj.a1 ); // a1 is private hence not accessible
		System.out.println("a2 ="+encapObj.a2 );
		System.out.println("a3 ="+encapObj.a3 );
		System.out.println("a4 ="+encapObj.a4 );
	}
}
