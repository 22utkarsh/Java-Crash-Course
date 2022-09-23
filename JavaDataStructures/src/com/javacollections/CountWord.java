package com.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

import com.javads.reader.Read;

public class CountWord {
	public static void main(String[] args) {
		
		String[] list = Read.sc.nextLine().split(" ");
//		List<String> list = new LinkedList<String>(Arrays.asList(strArr));
		
		 Map<String, Integer> m1 = new HashMap<>();
	        for (String s: list)
	        {
	            Integer count = m1.get(s);
	            if (count == null) {
	                count = 0;
	            }
	 
	            m1.put(s, count + 1);
	        }
	 
	        for (Map.Entry<String, Integer> entry: m1.entrySet()) {
	            System.out.println(entry.getKey() + " -->Repeated -> " + entry.getValue() +" times");
	        }
	}
}
