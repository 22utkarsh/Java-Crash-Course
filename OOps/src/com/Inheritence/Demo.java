package com.Inheritence;

public class Demo {
	
	public static void main(String[] args) {
		
		// this is tightly coupled technique
//		Add add = new Add(4,5);
//		System.out.println(add.calculate());
//		
//		Substract sub = new Substract(4,5);
//		System.out.println(sub.calculate());
//		
//		Multiply multi = new Multiply(4,5);
//		System.out.println(multi.calculate());
//		
//		Divide div = new Divide(40,5);
//		System.out.println(div.calculate());
		
		// this is loosely coupled technique it required same method in parent as well as child
		Arithmetic add = new Add(4,5);
		System.out.println(add.calculate());
		
		Arithmetic sub = new Substract(4,5);
		System.out.println(sub.calculate());  // here calculate method is same in Parent class and child
		
		Arithmetic multi = new Multiply(4,5);
		System.out.println(multi.calculate());
		
		Arithmetic div = new Divide(40,5);
		System.out.println(div.calculate());
	}
	
}
