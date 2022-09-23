package com.employee;

public class EmployeeBo {
	
	public void taxCalculation(EmployeeDto obj) throws Exception{
		if(obj.getSalary()>=250000.00 && obj.getSalary()<=500000.00) {
			obj.setTax(obj.getSalary()*0.05);
		}
		else if(obj.getSalary()>500000.00 && obj.getSalary()<=1000000.00) {
			obj.setTax(obj.getSalary()*0.10);
		}
		else if(obj.getSalary()>100000.00 && obj.getSalary()<=1500000.00) {
			obj.setTax(obj.getSalary()*0.15);
		}
		else if(obj.getSalary()>1500000.00 && obj.getSalary()<=2000000.00) {
			obj.setTax(obj.getSalary()*0.20);
		}
		else if(obj.getSalary()>2000000.00 ) {
			obj.setTax(obj.getSalary()*0.3);
		}
	}

}
