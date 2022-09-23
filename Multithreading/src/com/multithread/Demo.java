package com.multithread;

public class Demo {
	
	public static void main(String[] args) {
		// 4 threads are here main ,t1 ,t2,t3,t4
		ThreadDemo t1 =new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo(5,"Infosys");
		ThreadDemo t3 = new ThreadDemo(10,"TCS");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Program Begin...");
	}
}
