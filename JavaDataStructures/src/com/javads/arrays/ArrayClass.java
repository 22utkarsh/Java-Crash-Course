package com.javads.arrays;



import java.util.Arrays;

import com.javads.reader.Read;

public class ArrayClass {
	int arr[];
	public ArrayClass() {
		arr= new int[5];
	}
	public ArrayClass(int n) {
		arr= new int[n];
	}
	public void read() throws Exception{
		System.out.println("Please Enter "+arr.length+" Numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Read.sc.nextInt();
		}
	}
	
	public void display() throws Exception {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public void sort() throws Exception{
		Arrays.sort(arr);
	}
}
