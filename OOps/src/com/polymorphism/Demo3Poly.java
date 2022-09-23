package com.polymorphism;

public class Demo3Poly {
	public static void main(String[] args) {
		AdditionOfTwo addObj = new AdditionOfTwo();
		
		System.out.println(addObj.add(4,5));
		System.out.println(addObj.add(4.6f,5));
		System.out.println(addObj.add(4,5.4f));
		System.out.println(addObj.add(4.5f,5.7f));
		System.out.println(addObj.add("Hello !", "EveryOne !"));
	}
}
