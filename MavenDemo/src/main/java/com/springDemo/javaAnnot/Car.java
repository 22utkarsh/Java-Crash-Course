package com.springDemo.javaAnnot;

public class Car {
	String name;
	Vehicle vehicle;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String name, Vehicle vehicle) {
		super();
		this.name = name;
		this.vehicle = vehicle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", vehicle=" + vehicle + "]";
	}
	
}
