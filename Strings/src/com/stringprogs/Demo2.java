package com.stringprogs;

public class Demo2 {
	public static void main(String[] args) {
		String s1 = "wipro";
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);  
		
		int a=21;
		int a1=021;   //octal
//		int a3=028;   // it will show error as 8 is not in octal bit range(0-7)
		/*
		 * binary of 2 --> 010
		 * binary of 1 --> 001
		 * binary of 21 --> 010001  =>17
		 * 
		 * */
		
		System.out.println(a);
		System.out.println(a1);  //17
		
		int a2 = 0x21;  // hexadecimal value
		/*
		 * 
		 * binary of 2 --> 0010
		 * binary of 1 --> 0001
		 * binary of 21 --> 00100001  =>33
		 * */
		System.out.println(a2);
		
		
	}
}
