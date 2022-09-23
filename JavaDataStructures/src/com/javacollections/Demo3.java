package com.javacollections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		Integer[] arr = {12,45,23,45,14,67,12};
		Set<Integer> s1 = new LinkedHashSet(Arrays.asList(arr));
		System.out.println(s1);
		Object[] arr1= s1.toArray();
		
		for (int i=0; i < arr1.length; i++) {
			System.out.println((arr1[i]));
		}
	}
}
