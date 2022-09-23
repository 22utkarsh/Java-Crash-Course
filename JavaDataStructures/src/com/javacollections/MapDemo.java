package com.javacollections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		/*
		 * Map is Interface and it does not have sub interfaces
		 * */
		
		Map<String, Integer> m1 = new LinkedHashMap<String, Integer>();
		m1.put("Delhi", 342423);
		m1.put("Banglore", 23423);
		m1.put("Pune",23123);
		m1.put("Mumbai",464545);
		m1.put("Mumbai",500000);  // if there is duplicate it will update it with latest value
		System.out.println(m1);
		
		for(String x:m1.keySet()) {
			System.out.println(x+"---"+m1.get(x));
		}
		
		System.out.println(m1.get("Delhi"));
		
	}
}
