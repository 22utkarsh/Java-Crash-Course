package com.stringprogs;

import com.reader.Read;

public class StringLengthRegex {
	public static void main(String[] args) {
		String email = Read.sc.nextLine();
		String regex = "^[A-Za-z]{3}";  
		if (email.matches(regex)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
}
