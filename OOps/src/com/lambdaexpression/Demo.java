package com.lambdaexpression;

import java.util.Scanner;


public class Demo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Arithmetic[] obj = new Arithmetic[4];
		obj[0]=(a,b)->(a+b);
		obj[1]=(a,b)->(a-b);
		obj[2]=(a,b)->(a*b);
		obj[3]=(a,b)->(a/b);
		
		System.out.println("Enter Two Numbers and choose ");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mult");
		System.out.println("4. Div");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int ch = sc.nextInt();
		System.out.println(obj[ch-1].calculate(n1, n2));
	}
}
