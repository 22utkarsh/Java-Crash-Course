package com.fixedDepo;

import java.util.Calendar;

import com.reader.Read;

public class FIxedDeposit {

	public static void main(String[] args) {
		
		Calendar c1 = Calendar.getInstance();
		
		System.out.println("Enter Year-Month-Day");
		c1.set(Read.sc.nextInt(), Read.sc.nextInt(), Read.sc.nextInt());
		
		System.out.println("Enter amount");
		double amount = Read.sc.nextDouble();
		
		System.out.println("Enter Months to Deposite :");
		int numOfMonth=Read.sc.nextInt();
		
		c1.add(Calendar.MONTH, numOfMonth);
		
		amount=+((amount*0.065*(numOfMonth))/12);
		
		System.out.println("Maturity Date :"+c1.get(Calendar.DATE)+"-"+ c1.get(Calendar.MONTH) +"-"+c1.get(Calendar.YEAR)+" Amount will Received :"+amount);
		

	}

}
