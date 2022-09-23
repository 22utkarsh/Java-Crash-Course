package com.stringprogs;

import com.reader.Read;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the String Value :");
		String s1 = Read.sc.nextLine();	
		if(s1.equals(new StringBuffer(s1).reverse().toString())) {
			System.out.println("Yes Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
}
