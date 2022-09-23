package com.javacollections.program;

public class Student {
	private String name;
	private int age;
	private int marks;
	
	public Student() {
		
	}
	public Student(String name, int age, int marks) {
		
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.hashCode()==obj.hashCode()) {
			return true;
		}else {
			return false;
		}
		
		// if want to change the equals to do that
//		Student ob = (Student) obj;
//		if (this.getName()==ob.getName()) {
//			return true;
//		}else {
//			return false;
//		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (age+ marks+name.hashCode());
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
}
