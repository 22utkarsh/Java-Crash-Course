package com.exception;

import com.exception.Reader.Read;

public class Demo1 {
	
	public static void main(String[] args) {
		System.out.println("Begining of the program.....");
//		
//		int a,b,c;
//		System.out.println("Enter 2 numbers");
//		a=Read.sc.nextInt();
//		b=Read.sc.nextInt();
//		c=a/b;              // if we give value of b=0 it will show error
//		System.out.println(c);
//		System.out.println("End of the program!!");
//		System.out.println("Begining of the program.....");
		
//---------------------------------------------------------------------
//		int a,b,c;
//		System.out.println("Enter 2 numbers");
//		a=Read.sc.nextInt();
//		b=Read.sc.nextInt();
//		try {
//			c=a/b;
//			System.out.println(c);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}              
//		
//		System.out.println("End of the program!!");
		
		
		// we have to put specific exception always first and general at last
		// otherwise it will show error for unreachable code
//		int a,b,c;
//		System.out.println("Enter 2 numbers");
//		a=Read.sc.nextInt();
//		b=Read.sc.nextInt();
//		try {
//			c=a/b;
//			System.out.println(c);
//		} 
//		catch (ArithmeticException e) {  // specific exception block
//			System.out.println(e.getMessage()+" I am in Arithmetic catch block");
//		}
//		catch (Exception e) {		// genral exception block
//			System.out.println(e.getMessage());
//		}              
//		
//		System.out.println("End of the program!!");
		
		
		int a,b,c;
		System.out.println("Enter 2 numbers");
		a=Read.sc.nextInt();
		b=Read.sc.nextInt();
		try {
			Modules obj = new Modules();   // centrally handling
			c=obj.divide(a, b);
			System.out.println(c);
//			return;
		} 
		catch (ArithmeticException e) {  
			System.out.println(e.getMessage()+" I am in Arithmetic catch block");
		}
		catch (Exception e) {		// genral exception block
			System.out.println(e.getMessage());
		}              
		
		// finally block always executed 
		finally { 
			System.out.println("End of the program!!");
		}
//		System.out.println("End of the program!!");
	}
}


