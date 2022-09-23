package com.javacollections;

import java.util.*;


class Student {
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
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name.hashCode()+age+marks);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	
}
public class AlphabeticalOrd {
	
	public static void main(String[] args) {
		Student s1 = new Student("Ram",12,89);
		Student s2 = new Student("Ram",34,67);
		Student s3 = new Student("Ram2",23,87);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.getName().hashCode());
		System.out.println(s2.getName().hashCode());
		System.out.println(s3.getName().hashCode());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
//		List<Student> s1 = new ArrayList<Student>();
//		s1.add(new Student("Utkarsh", 22, 81));
//		s1.add(new Student("Pramod", 22, 90));
//		s1.add(new Student("Charu", 22, 99));
//		s1.add(new Student("chota chetan", 20, 75));
//		s1.add(new Student("Gabbar", 62, 30));
		
		
	}
	
}
