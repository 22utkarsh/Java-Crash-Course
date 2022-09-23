package com.rummy;

import java.util.ArrayList;
import java.util.List;

class Game{
	public String[] cards = {"DEUCE", "THREE", "FOUR", "FIVE", "SIX",
	        "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
	public String[] suit = {"Heart","Spade","Diamond","Club"};
//	public List<String> p1Card= new ArrayList<String>();
//	public List<String> p2Card= new ArrayList<String>();
//	public List<String> p3Card= new ArrayList<String>();
	
	public synchronized void f1(int i,int j) {
		try {
			notify();   // it will released current thread to run.
			System.out.println(cards[j]+" of "+suit[i]);
			wait();    // it will put current thread to wait
		} catch (Exception e) {
			
		}
		
	}
	public synchronized void f2(int i,int j) {
		try {
			notify();   // it will released current thread to run.
			System.out.println(cards[j]+" of "+suit[i]);
			wait();    // it will put current thread to wait
		} catch (Exception e) {
			
		}
	}
	public synchronized void f3(int i,int j) {
		try {
			notify();   // it will released current thread to run.
			System.out.println(cards[j]+" of "+suit[i]);
			wait();    // it will put current thread to wait
		} catch (Exception e) {
			
		}
	}
}

class Player1 extends Thread{
	Game obj;
	public Player1() {
		
	}
	public Player1(Game obj) {
		this.obj=obj;
	}
	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				obj.f1(i, j);
			}
		}
	}
}
class Player2 extends Thread{
	Game obj;
	public Player2() {
		
	}
	public Player2(Game obj) {
		this.obj=obj;
	}
	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				obj.f1(i, j);
			}
		}
	}
}
class Player3 extends Thread{
	Game obj;
	public Player3() {
		
	}
	public Player3(Game obj) {
		this.obj=obj;
	}
	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				obj.f1(i, j);
			}
		}
	}
}



public class Rummy {
	public static void main(String[] args) {
		Game game = new Game();
		Player1 p1 = new Player1(game);
		Player2 p2 = new Player2(game);
		Player3 p3 = new Player3(game);
		
		p1.start();
		p2.start();
		p3.start();
	}

}
