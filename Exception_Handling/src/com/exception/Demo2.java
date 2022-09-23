package com.exception;

import com.exception.Reader.Read;

public class Demo2 {
	
	public static void main(String[] args) {
		int balance = 10000;
		try {
			System.out.println("Enter Withdrawl Ammount :");
			int wAm = Read.sc.nextInt();
			if(wAm>balance)
				throw new InsufficientBalance();
			System.out.println("Please wait...Transaction is under process!");
		}catch(InsufficientBalance e) {
			System.out.println(e.getMessage());
		}
	}
}
