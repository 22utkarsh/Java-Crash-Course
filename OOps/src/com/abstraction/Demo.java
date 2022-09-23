package com.abstraction;

public class Demo {
	
	public static void main(String[] args) {
		Payment obj = new IPayment();
		System.out.println(obj.doPayment(22082000, 25000));
		
		Payment obj1 =(x,y)->("Your Payment of Rupees :"+y+" Credited to :"+x);
		System.out.println(obj1.doPayment(12345, 30000));
	}
}
