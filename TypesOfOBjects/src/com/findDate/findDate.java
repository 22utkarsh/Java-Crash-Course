package com.findDate;

import java.util.Calendar;

public class findDate {

	public static void main(String[] args) {
		
//		Calendar c1 =  Calendar.getInstance();  // it will inject the object of the calendar
//		c1.set(2021, 11, 4);   
//		int numberOfDays;
//		int numberOfDays1;
//		numberOfDays = (int)(12*29.5);
//		numberOfDays1 = (int)(13*29.5);
//		int flag =2;
//		
//		for (int i = 0; i < 9; i++) {
//			if(flag==3) {
//				c1.add(Calendar.DATE, numberOfDays1);
//				flag=1;
//			}else {
//				c1.add(Calendar.DATE, numberOfDays);
//				flag++;
//			}
//			System.out.println(c1.get(Calendar.DATE)+"-"+ c1.get(Calendar.MONTH) +"-"+c1.get(Calendar.YEAR));
//		}
		
		
		Calendar c1 =  Calendar.getInstance();  // it will inject the object of the calendar
		c1.set(2021, 11, 4);   
		int numberOfDays;
		
		numberOfDays = (int)(12*29.5);
		
		int flag =2;
		
		for (int i = 0; i < 9; i++) {
			
				c1.add(Calendar.DATE, numberOfDays);
			
			System.out.println(c1.get(Calendar.DATE)+"-"+ c1.get(Calendar.MONTH) +"-"+c1.get(Calendar.YEAR));
		}
		
		
		
		
		
	}

}
