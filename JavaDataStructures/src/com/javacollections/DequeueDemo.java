package com.javacollections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueDemo {
	public static void main(String[] args) {
		Deque<Integer> dq1 = new LinkedList<Integer>();
		// last in first out
		// work as stack
		dq1.push(20);
		System.out.println(dq1);
		dq1.push(62);
		System.out.println(dq1);
		dq1.push(2);
		System.out.println(dq1);
		
		// LIFO  as Stack
//		System.out.println(dq1.pop());
//		System.out.println(dq1);
//		System.out.println(dq1.pop());
//		System.out.println(dq1);
//		System.out.println(dq1.pop());
//		System.out.println(dq1);
		
		
		//remove 1st element
		System.out.println(dq1.remove());
		System.out.println(dq1);
		System.out.println(dq1.remove());
		System.out.println(dq1);
		System.out.println(dq1.remove());
		System.out.println(dq1);
		
	}
}
