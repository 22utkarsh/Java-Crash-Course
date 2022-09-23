package com.polymorphism;



class Parent{
	String sirname;
	private String city;
	
	public Parent() {
		
	}
	public Parent(String sirname, String city) {
		super();
		this.sirname = sirname;
		this.city = city;
	}
	public String getSirname() {
		return sirname;
	}
	public void setSirname(String sirname) {
		this.sirname = sirname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
class Child extends Parent {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String city;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Child(String city) {
		super();
		this.city = city;
	}
	
	
}
public class Main {

}
