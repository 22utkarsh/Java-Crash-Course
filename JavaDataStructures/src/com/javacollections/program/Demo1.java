package com.javacollections.program;


public class Demo1 {
	public static void main(String[] args) {
		Student s1 = new Student("Ram",13,89);
		Student s2 = new Student("Ram",34,67);
		Student s3 = new Student("Ram2",23,87);
		
		System.out.println(s1);
		System.out.println(s2);
		
//		System.out.println(s1.getName().hashCode());
//		System.out.println(s2.getName().hashCode());
//		System.out.println(s3.getName().hashCode());
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
	}
}
