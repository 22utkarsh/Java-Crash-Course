package com.javacollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		// when the data comes we put it to queue after process overs we will remove from it
		q1.add(4);
		q1.add(23);
		q1.add(65);
		q1.add(1);
		q1.add(17);
		
		System.out.println(q1);
		System.out.println("----------------------");

		q1.remove();  //FIFO
		System.out.println(q1);
		System.out.println("----------------------");
		
		q1.remove();
		System.out.println(q1);
		System.out.println("----------------------");
		
		q1.remove();
		System.out.println(q1);
		System.out.println("----------------------");
		
		q1.add(13);
		System.out.println(q1);
		System.out.println("----------------------");
	}
}
