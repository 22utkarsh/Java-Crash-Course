package com.multithread;

public class ThreadDemo extends Thread {
	
	int n;
	String name;
	
	public ThreadDemo() {
		n=10;
		name="Wipro";
	}
	
	public ThreadDemo(int n, String name) {
		this.n = n;
		this.name = name;
	}
	
	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.println(name+"---->"+i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
}
