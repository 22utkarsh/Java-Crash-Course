package com.javacollections;

class D1<T1>{
	T1 a,b;
	public void setData(T1 a , T1 b) {
		this.a=a;
		this.b=b;
	}
	public void display() {
		System.out.println(a+" "+b);
	} 
}

class D2<T1,T2>{
	T1 a;
	T2 b;
	public void setData(T1 a , T2 b) {
		this.a=a;
		this.b=b;
	}
	public void display() {
		System.out.println(a+" "+b);
	} 
}

public class Demo_ {
	
	public static void main(String[] args) {
		D1<Integer> obj = new D1();
		obj.setData(23, 12);
		obj.display();
		
		D1<String> obj2 = new D1();
		obj2.setData("Hello", "Developers");
		obj2.display();
		
		D2<String, Double> obj3 = new D2();
		obj3.setData("Double value :", 23234.234);
		obj3.display();
		
	}
}
