package com.javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo {
	
	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
//		List<Integer> a1 = new LinkedList<Integer>();  // same o/p as arraylist
//		List<Integer> a1 = new Vector<Integer>();  // same o/p as arraylist
		
		a1.add(10);
		a1.add(400);
		a1.add(25);
		a1.add(36);
		a1.add(45);
		
		System.out.println(a1);
		// Retrieving the data from collection for loop and index
		System.out.println("-----For Loop-----");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		// for each loop
		System.out.println("-----For Each Loop-----");
		for(int i:a1) {
			System.out.println(i);
		}
		
		System.out.println("----Using Lambda expression and method Reference----");
		a1.forEach(System.out::println);  // :: it is scope resolution operation
										  // it indicates where println belong to
		
		System.out.println("---Reffereing to our own static methode----");
		a1.forEach(Demo::f1);
		
		
		System.out.println("---Reffereing to our own Non-static methode----");
		Demo obj = new Demo();
		a1.forEach(obj::f2);
		
		
		System.out.println("---Display using Iterator class---");
		Iterator<Integer> iter = a1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());   // every iter,next will take to the next element
											 // hence to want same element two times it should not use it.next it.next two times
											// for that u need to store it in variable to use it again
		}
		
		// Normally add funtion will add the data at the bottom to ass in between 
		// we should use index
		a1.add(0,125);
		System.out.println(a1);
		
		// To delete the element we can use index
		a1.remove(0);
		System.out.println(a1);
		
		// if u don't know the index then   remove delete the first occurance
		a1.remove(new Integer(400));
		System.out.println(a1);
		
		// to remove all the elemets
		a1.clear();
		System.out.println(a1);
	}
	
	
	public static void f1(Integer x) {
		System.out.println("Square of "+x+" is "+(x*x));
	}
	public void f2(Integer x) {
		System.out.println("Square root of "+x+" is "+(Math.sqrt(x)));
	}
}
