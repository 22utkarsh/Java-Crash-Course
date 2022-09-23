package com.stringprogs;

public class DemoStringBuff {
	
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("wipro");
		StringBuffer s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		s1.append(" Ltd");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.reverse());  // reverse the string
		System.out.println(s2);   // reverse the string value
	}
	
}
