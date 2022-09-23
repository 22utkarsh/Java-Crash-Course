package com.obj;

import com.reader.Read;

public class Demo {
	public static void main(String[] args) {
		AddDto addDto = new AddDto();
		AddBO addBo = new AddBO();
		System.out.println("Enter two num");
		addDto.setNum1(Read.sc.nextInt());
		addDto.setNum2(Read.sc.nextInt());
		try {
			addBo.add(addDto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(addDto);
	}
	
}