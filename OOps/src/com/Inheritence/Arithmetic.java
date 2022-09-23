package com.Inheritence;

public class Arithmetic {
	
	int num1;
	
	int num2;
	
	int result;
	public Arithmetic() {
		num1=num2=0;
	}
	
	public Arithmetic(int num) {
		num1=num2=num;
	}
	
	public Arithmetic(int a, int b) {
		num1=a;
		num2=b;
	}
	public int calculate() {
		return 0;
	}
	public int add() {
		return num1+num2;
	}
	public int sub() {
		return num1-num2;
	}
	public int multiply() {
		return num1*num2;
	}
	public int divide() {
		return num1/num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	

}
