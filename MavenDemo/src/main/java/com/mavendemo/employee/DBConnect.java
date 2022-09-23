package com.mavendemo.employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	static public Connection co = null;
	public static Connection getConnection() throws Exception {
		if(co==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			co=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		}
		return co;
	}
}
