package com.mavendemo.employee;

import java.util.List;
import java.util.Vector;

public class ThreadClass extends Thread{
	
	EmployeeDao empDao;
	int from;
	int to;
	public ThreadClass() {
		
	}
	public ThreadClass(EmployeeDao empDao,int from,int to) {
		this.empDao=empDao;
		this.from=from;
		this.to=to;
	}
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		try {
			Vector<Employee> li = this.empDao.getAllEmployee();
			for(Employee e:li) {
				this.empDao.updateEmployeeTax(e);
			}
//			empDao.getEmployees(from, to).forEach(System.out::println);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
