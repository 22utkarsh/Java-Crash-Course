package com.mavendemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	public List<StudentDto> getAllStudent() throws Exception {
		Connection co = DBConnector.getConnection();
		PreparedStatement ps = co.prepareStatement("select * from student.student");
		ResultSet rs = ps.executeQuery();
		List<StudentDto> li = new ArrayList<StudentDto>();
		while(rs.next()) {
			li.add(new StudentDto(rs.getString(1),rs.getString(2),rs.getString(3)));
		}
		return li;
	}
	
	public void getAnyStudent(StudentDto obj) throws Exception {
		Connection co = DBConnector.getConnection();
		PreparedStatement ps = co.prepareStatement("select * from student.student where studentid=?");
		ps.setInt(1, Integer.parseInt(obj.getStudentid()));
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			obj.setfName(rs.getString(2));
			obj.setlName(rs.getString(3));
			
		}else {
			throw new Exception("Student Id does not exist :(");
		}
	}
	
	public void addStudent(StudentDto obj) throws Exception {
		Connection co = DBConnector.getConnection();
		PreparedStatement ps = co.prepareStatement("insert into student.student values (?,?,?)");
		ps.setInt(1, Integer.parseInt(obj.getStudentid()));
		ps.setString(2, obj.getfName());
		ps.setString(3, obj.getlName());	
		ps.executeUpdate();
	}
}
