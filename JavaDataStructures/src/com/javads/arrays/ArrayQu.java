package com.javads.arrays;

public class ArrayQu {
	public static void main(String[] args) {
//		ArrayClass arr = new ArrayClass(5);
//		try {
//			arr.read();
//			arr.display();
//			arr.sort();
//			arr.display();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		
		TwoDArr arr1 = new TwoDArr();
		TwoDArr arr2 = new TwoDArr();
		TwoDArr arr = new TwoDArr();
		try {
			arr.add(arr1.read(), arr2.read());
			arr.display();
		} catch (Exception e) {
			System.out.println(e);
		}
		
//		TwoDArr arr1 = new TwoDArr(3,3);
//		TwoDArr arr2 = new TwoDArr(3,3);
//		TwoDArr arr = new TwoDArr(3,3);
//		try {
//			arr.add(arr1.read(), arr2.read());
//			arr.display();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		
		
		
		
	}
}
