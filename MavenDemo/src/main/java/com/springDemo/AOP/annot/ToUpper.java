package com.springDemo.AOP.annot;

import org.springframework.stereotype.Component;

@Component
public class ToUpper {
	private String string;
	public ToUpper() {
		// TODO Auto-generated constructor stub
	}
	public ToUpper(String string) {
		super();
		this.string = string;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	@Override
	public String toString() {
		return "ToUpper [string=" + string + "]";
	}
	
}
