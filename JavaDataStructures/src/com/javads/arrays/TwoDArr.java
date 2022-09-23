package com.javads.arrays;

import com.javads.reader.Read;

public class TwoDArr {
	int arr[][];
	
	public TwoDArr() {
		arr= new int[2][2];
	}
	
	public TwoDArr(int i,int j) {
		arr= new int[i][j];
	}
	
	public int[][] read() throws Exception{
		int row = arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=Read.sc.nextInt();
			}
		}
		return arr;
	}
	
	public void display() throws Exception {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void add(int arr1[][] , int arr2[][]) throws Exception {
		if(arr1[0].length==arr2[0].length) {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[0].length; j++) {
					arr[i][j]=arr1[i][j]+arr2[i][j];
				}
				
			}
		}else {
			System.out.println("given array is not a matrix");
		}
	}
}
