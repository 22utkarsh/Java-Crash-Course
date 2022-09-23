package com.mavendemo.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;




public class EmployeeDao {
	
	public void addEmployee(Employee obj) throws Exception {
		Connection co = DBConnect.getConnection();
		PreparedStatement ps = co.prepareStatement("insert into employee.employees values (?,?,?,?)");
		ps.setInt(1, obj.getEmpId());
		ps.setString(2, obj.getEmpName());
		ps.setString(3, Double.toString(obj.getSalary()));	
		ps.setString(4, null);	
		ps.executeUpdate();
	}
	
	public Vector<Employee> getAllEmployee() throws Exception {
		Connection co = DBConnect.getConnection();
		PreparedStatement ps = co.prepareStatement("select * from employees");
		ResultSet rs =ps.executeQuery();
		Vector<Employee> li =new Vector<Employee>();
		while(rs.next()) {
			li.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3),rs.getDouble(4)));
		}
		return li;
	}
	
	public Vector<Employee> getEmployees(int from , int to) throws Exception {
		Connection co = DBConnect.getConnection();
		PreparedStatement ps = co.prepareStatement("select * from employees where empId between "+Integer.toString(from)+" and "+Integer.toString(to));
		ResultSet rs =ps.executeQuery();
		Vector<Employee> li =new Vector<Employee>();
		while(rs.next()) {
			li.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3),rs.getDouble(4)));
		}
		return li;
	}
	
	public void updateEmployeeTax(Employee obj) throws Exception {
		Connection co = DBConnect.getConnection();
		PreparedStatement ps = co.prepareStatement("update employee.employees set empTax=? where empId=?");
		ps.setString(1, Double.toString(obj.getSalary()*0.10));		
		ps.setInt(2, obj.getEmpId());		
		ps.executeUpdate();
	}
	
	
}
