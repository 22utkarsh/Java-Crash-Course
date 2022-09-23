package com.p1;

public class Address {
	
	String city;
	String state;
	String colony;
	int div;
	long pincode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, String colony, int div, long pincode) {
		super();
		this.city = city;
		this.state = state;
		this.colony = colony;
		this.div = div;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public int getDiv() {
		return div;
	}
	public void setDiv(int div) {
		this.div = div;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", colony=" + colony + ", div=" + div + ", pincode="
				+ pincode + "]";
	}
	
}
