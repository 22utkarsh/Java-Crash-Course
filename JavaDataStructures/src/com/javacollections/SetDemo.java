package com.javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<Integer> setObj = new HashSet<Integer>();
		
		setObj.add(1);
		setObj.add(12);
		setObj.add(9);
		setObj.add(25);
		setObj.add(2);
		setObj.add(49);
		setObj.add(49);   // no error but it didn't add it again in set
		setObj.add(12);
		
		// insertion order is not maintained
		System.out.println(setObj); //[1, 49, 2, 9, 25, 12]
   
		// Retrieving the data from collection for loop and index
				System.out.println("-----For Loop-----");
				for (int i = 0; i < setObj.size(); i++) {
					System.out.println(setObj.toArray()[i]);
				}
				
				// for each loop
				System.out.println("-----For Each Loop-----");
				for(int i:setObj) {
					System.out.println(i);
				}
//				
				System.out.println("----Using Lambda expression and method Reference----");
				setObj.forEach(System.out::println);  // :: it is scope resolution operation
												  // it indicates where println belong to
//				
				System.out.println("---Reffereing to our own static methode----");
				setObj.forEach(Demo::f1);
//				
//				
				System.out.println("---Reffereing to our own Non-static methode----");
				Demo obj = new Demo();
				setObj.forEach(obj::f2);
//				
//				
				System.out.println("---Display using Iterator class---");
				Iterator<Integer> iter = setObj.iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());   // every iter,next will take to the next element
													 // hence to want same element two times it should not use it.next it.next two times
													// for that u need to store it in variable to use it again
				}
				
				// in set element cannot be add in specific index as its unordered collections
				setObj.add(125);
				System.out.println(setObj);
				
				// To delete the element we can pass that element direclty in methode
				setObj.remove(125);
				System.out.println(setObj);
				
				
				// to remove all the elemets
				setObj.clear();
				System.out.println(setObj);
			}
			
			
			public static void f1(Integer x) {
				System.out.println("Square of "+x+" is "+(x*x));
			}
			public void f2(Integer x) {
				System.out.println("Square root of "+x+" is "+(Math.sqrt(x)));
			}
	
}