package com.rummy;

import java.util.ArrayList;
import java.util.List;

public class Rummy2 extends Thread{
	
	public String[] cards = {"DEUCE", "THREE", "FOUR", "FIVE", "SIX",
	        "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
//	public String[] suit = {"Heart","Spade","Diamond","Club"};
	int a = cards.length;
//	int b = suit.length;
	List<String> arr = new ArrayList<String>();
	String name;
	public Rummy2(String name) {
		this.name=name;
	}
	
	public void run() {
//		for (int i = 0; i < this.b; i++) {
			for (int j = 0; j <this.a ; j++) {
				System.out.println(name+"--->"+cards[j]);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
//		}

	}
}
