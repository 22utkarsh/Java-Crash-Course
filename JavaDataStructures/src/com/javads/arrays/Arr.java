package com.javads.arrays;

public class Arr {
	
	int[] a = new int[10];
	
	int b[] = new int[10];
	
	int[] c = new int[] {1,2,3};
	
	int[] d = {1,2,3,4};
	
//	inta[] = new int[];  //invalid
//	int e = new int[10];   //invalid
	
	int a1[] = a;
	
	int []arr[] = new int[10][3];   // valid 
	int arr2[][] = new int[10][3];   // valid 
	int [][]arr3 = new int[10][3];   // valid 
	int [][]arr4 = new int[3][];   // valid // jagged array
	
//	int a[][] = new int[][2]   //invalid  //row is compulsory column is optional
	
	int jagged1 [][] = {{10,3,2},{2,3}};  // valid
	
	int jagged2 [][] = {{10,3,2},{2,3},{1,2,3,4}};  // valid
	
//	int invalid[3][] = new int[][];  //invalid
	
	
	int jagg[][] = new int[][] {{1,2,3}};
	
}
