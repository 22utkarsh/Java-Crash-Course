package com.tiktok;

class Game{
	public synchronized void f1() {
		try {
			notify();   // it will released current thread to run.
			System.out.print("Tik -");
			wait();    // it will put current thread to wait
		} catch (Exception e) {
			
		}
	}
	
	public synchronized void f2() {
		try {
			notify();   // it will released current thread to run.
			System.out.println(" Tok");
			wait();    // it will put current thread to wait
		} catch (Exception e) {
			
		}
	}
	
}

class Player1 extends Thread {
	Game obj;
	public Player1() {
		super();
	}
	public Player1(Game obj) {
		super();
		this.obj = obj;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			obj.f1();
		}
	}
}

class Player2 extends Thread {
	Game obj;
	public Player2() {
		super();
	}
	public Player2(Game obj) {
		super();
		this.obj = obj;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			obj.f2();
		}
	}
}

public class TikTok {
	public static void main(String[] args) {
		
		Game game = new Game();
		Player1 p1 = new Player1(game);
		Player2 p2 = new Player2(game);
		
		p1.start();
		p2.start();
		
	}
}
