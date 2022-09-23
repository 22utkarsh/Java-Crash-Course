package com.Inheritence;



public class DemoAssign {
	
	
	public static void main(String[] args) {
		
		Arithmetic[] obj = new Arithmetic[4];
		obj[0]=new Add();
		obj[1]=new Substract();
		obj[2]=new Multiply();
		obj[3]=new Divide();
		

		System.out.println("Enter Number and choose ");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mult");
		System.out.println("4. Div");
		int n1 = Read.sc.nextInt();
		int n2 = Read.sc.nextInt();
		int ch = Read.sc.nextInt();
		obj[ch-1].setNum1(n1);
		obj[ch-1].setNum2(n2);
		System.out.println(obj[ch-1].calculate());
		
	}
	
}
