package com.springDemo;

public class Holiday {
	String holidayName;
	String date;
	public Holiday() {
		
	}
	public Holiday(String holidayName, String date) {
		this.holidayName = holidayName;
		this.date = date;
	}

	public String getHolidayName() {
		return holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void display() {
		System.out.println("I am on Holiday cause of "+holidayName+ " on "+date);

	}
}
