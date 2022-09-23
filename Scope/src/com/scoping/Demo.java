package com.scoping;

public class Demo {
	public static void main(String[] args) {
//		System.out.println(Add.n1);  // error as n1 is instance var
		
		System.out.println(Add.n3);   // n3 has class scope 
		
		Add obj = new Add();
		obj.n1=10;
		obj.n3=30;
		System.out.println(obj.n3);
		System.out.println(obj.n1);
		
		
		Add obj1 = new Add();
		System.out.println(obj1.n3);
		System.out.println(obj1.n1);
		

		
		obj=null;
		// Daemon thread is a thread created by JVM in backend.
		// it is not responsible to destructor.
		System.gc(); // it is Daemon thread.  // it is garbage collector, is responsible to remove object.
		obj1=null;
		System.gc();  // it is garbage collector, is responsible to remove object.
		
//		System.out.println(obj.n1);   // null pointer exception 
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Add.n3);
		
		
	}
}
