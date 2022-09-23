package com.encapsulation;

// data hiding is done with encapsulation using access specifiers

public class Encapsulation {
	
	private int a1=10;
	
	int a2=20;
	
	protected int a3=30;
	
	public int a4 =40;
	
	private void f1() {
		System.out.println("I am in f1 :"+a1);
	}
	
	void f2() {
		System.out.println("I am in f2 :"+a2);
	}
	
	protected void f3() {
		System.out.println("I am in f3 :"+a3);
	}
	
	public void f4() {
		System.out.println("I am in f4 :"+a4);
	}

}

