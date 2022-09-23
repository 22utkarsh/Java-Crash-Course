package com.encapsulation.more;

import com.encapsulation.Encapsulation;

public class Demo2Encap {
	
	public static void main(String[] args) {
		
		// calling methods in another packges
		Encapsulation encapObj = new Encapsulation();
		
		//encapObj.f1();  // it is private method hence showing the error
		
//		encapObj.f2();   // it is default method hence showing error
//		
//		encapObj.f3();	// it is protected hence showing error
		
		encapObj.f4();   // it is public hence working
		
	   //System.out.println("a1 ="+encapObj.a1 ); // a1 is private hence not accessible
//		System.out.println("a2 ="+encapObj.a2 );  // a2 is default not accessible
//		System.out.println("a3 ="+encapObj.a3 );  // a3 is protected not accessible
		System.out.println("a4 ="+encapObj.a4 );
	}
}
