package com.employee;

public class Demo {
	public static void main(String[] args) {
		EmployeeDto empObj = new EmployeeDto(1, "Utkarsh", 400000);
		EmployeeDto empObj2 = new EmployeeDto(2, "Pramod", 700000);
		EmployeeDto empObj3 = new EmployeeDto(3, "Charu", 3000000);
		EmployeeBo obj =new EmployeeBo();
		try {
			obj.taxCalculation(empObj);
			obj.taxCalculation(empObj2);
			obj.taxCalculation(empObj3);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(empObj);
		System.out.println(empObj2);
		System.out.println(empObj3);
	}
}