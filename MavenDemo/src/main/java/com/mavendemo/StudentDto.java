package com.mavendemo;

public class StudentDto {
	private String studentid;
	private String fName;
	private String lName;
	
	public StudentDto() {}
	public StudentDto(String studentid, String fName, String lName) {
		this.studentid = studentid;
		this.fName = fName;
		this.lName = lName;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "StudentDto [studentid=" + studentid + ", fName=" + fName + ", lName=" + lName + "]";
	}
}
