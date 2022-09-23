package com.mavendemo.employee;

import java.sql.Connection;
import java.util.List;
import java.util.Vector;

public class EmployeeApp {
	public static void main(String[] args) {
//		 try {
//		    	Connection connect = DBConnect.getConnection();
//		    	System.out.println("Connection successful");
//				
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		
//		try {
//			EmployeeDao empDao = new EmployeeDao();
//			for (int i = 1; i < 31; i++) {
//				System.out.println("Enter Id name and salary");
//				Employee emp = new Employee(Read.sc.nextInt(), Read.sc.next(), Read.sc.nextDouble());
//				empDao.addEmployee(emp);
//			}
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		try {
    		EmployeeDao ed = new EmployeeDao();
//    		List<Employee> li = ed.getAllEmployee();
//    		li.forEach(System.out::println);
    		ThreadClass th1 = new ThreadClass(ed,1,10);
    		ThreadClass th2 = new ThreadClass(ed,11,20);
    		ThreadClass th3 = new ThreadClass(ed,21,30);
 			th1.start();
 			th2.start();
 			th3.start();
 		} catch (Exception e) {
 			System.out.println(e.getMessage());
 		}
	}
}
