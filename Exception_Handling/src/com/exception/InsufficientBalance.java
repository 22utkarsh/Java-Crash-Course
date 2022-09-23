package com.exception;

public class InsufficientBalance extends Exception{
	
	public InsufficientBalance() {
		super("Funds not sufficient. Your Transaction is Canceled !");
	}

}
