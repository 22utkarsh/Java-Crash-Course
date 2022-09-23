package com.springDemo.AOP;

public class IArithm implements Arithmetic {

	@Override
	public Double add(Double a, Double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public Double subtract(Double a, Double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public Double multiply(Double a, Double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public Double divide(Double a, Double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
