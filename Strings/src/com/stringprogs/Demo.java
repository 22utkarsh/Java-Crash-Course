package com.stringprogs;

public class Demo {
	public static void main(String[] args) {
		String s1 = "Wipro";   // preferred way
		String s2 = "Wipro";
		String s3 =  new String("Wipro");   // bad practice
		
		if (s1==s2) {    // s1 and s2  two obj pointing same reference
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
//		s2=s2+" Ltd";
//		if (s1==s2) {    // s1 and s2  two obj pointing different reference
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");   // output
//		}
		
		
		if(s1==s3) {   // s1 and s3 2 diff obj pointing two difference reference
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		if (s1.equals(s2)) { // s1 an s2 two obj with same value at the reference
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		if (s1.equals(s3)) {  // s1 an s3 two obj with same value at the reference
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
