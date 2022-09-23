package com.exception;

import com.exception.Reader.Read;

public class Demo3 {
	public static void main(String[] args) {
		String name;
		int age;
		System.out.println("Enter name and age");
		name=Read.sc.next();
		age=Read.sc.nextInt();
		
		try {
			if(!(age>5 && age<7)) {
				throw new AgeModule();
			}
			System.out.println(name+" your admission is done!!");
		}
		catch(AgeModule e) {
			System.out.println(e.getMessage());
		}
	}
}
