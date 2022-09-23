package com.stringprogs;

import com.reader.Read;

public class FindBigWord {
	public static void main(String[] args) {
		
		System.out.println("Enter sentence");
		
		String[] strArr = Read.sc.nextLine().split(" ");
		
		
		int bigWord=strArr[0].length();
		
		int bigInd=0;
		
		for (int i = 1; i < strArr.length; i++) {
			
			if(strArr[i].length()>bigWord) {
				bigInd=i;
			}
		}		
	System.out.println("Big word is :"+strArr[bigInd]);
	}
}
