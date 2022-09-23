package com.stringprogs;

public class Demo3 {
	public static void main(String[] args) {
		String s1 = "Wipro";
		String s2 = "Wipro";
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		String s3 = "[W].*";
		System.out.println(s1.matches(s3));
		
	}
}
