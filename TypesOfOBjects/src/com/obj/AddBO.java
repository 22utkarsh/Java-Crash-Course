package com.obj;

public class AddBO {
	public void add(AddDto obj) throws Exception {
		
		obj.setRes(obj.getNum1()+obj.getNum2());
		obj.setRestype("Addition");
	}
	public void sub(AddDto obj) throws Exception {
		
		obj.setRes(obj.getNum1()-obj.getNum2());
		obj.setRestype("Subtraction");
	}
}
