package com.springDemo.javaAnnot;

public class Vehicle {
	double speed;
	int tyres;
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(double speed, int tyres) {
		super();
		this.speed = speed;
		this.tyres = tyres;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", tyres=" + tyres + "]";
	}
	
}
