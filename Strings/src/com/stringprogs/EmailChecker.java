package com.stringprogs;

import com.reader.Read;

public class EmailChecker {
	public static void main(String[] args) {
		String email = Read.sc.nextLine();
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
		
		if (email.matches(regex)) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Invalid email");
		}
	}
}
