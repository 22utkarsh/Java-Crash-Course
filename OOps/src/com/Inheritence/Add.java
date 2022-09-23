package com.Inheritence;

public class Add extends Arithmetic {

	public Add(int a, int b) {
		super(a,b);
	}	
	public Add() {
		super();
	}
	
	public int calculate() {
		return (super.add());
	}

}
