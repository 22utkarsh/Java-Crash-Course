package com.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
		Integer[] arr = {1,5,2,7,4,11,45};
		Integer[] arr1 = {11,3,45,23,6,2,7};
		
		// converting array into collections
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> lst1 = new ArrayList<Integer>(Arrays.asList(arr1));
		System.out.println(lst);
		System.out.println(lst1);
		
		System.out.println("-----------");
		System.out.println(lst);
		
//		lst.addAll(lst1); // all the elements of lst1 are add as individual elements of lst
//		System.out.println("----adter adding lst to lst1-----");
//		System.out.println(lst);
		
		
//		System.out.println("----After remove Lst1 from lst----");
//		lst.removeAll(lst1);    // it removes the common element present in lst1 and lst
//		System.out.println(lst);
		
		System.out.println("----After retain Lst1 from lst----");
		lst.retainAll(lst1);    // it retain the common element present in lst1 and lst
		System.out.println(lst);
		
		
	}

}
