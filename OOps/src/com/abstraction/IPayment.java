package com.abstraction;

public class IPayment implements Payment {

	@Override
	public String doPayment(long ac, int amount) {
		
		return "Account No :"+ac+"  Your Account is Credited with :"+amount;
	}

}
