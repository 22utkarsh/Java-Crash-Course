package com.mavendemo.employee;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private double empTax;
	public Employee(int empId, String empName, double salary, double empTax) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.empTax = empTax;
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
//		this.empTax = empTax;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getEmpTax() {
		return empTax;
	}
	public void setEmpTax(double empTax) {
		this.empTax = empTax;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", empTax=" + empTax + "]";
	}
	
}
