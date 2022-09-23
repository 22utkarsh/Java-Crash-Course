package com.javacollections.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Utkarsh", 22, 81));
		students.add(new Student("Pramod", 22, 90));
		students.add(new Student("Charu", 22, 99));
		students.add(new Student("Chetan", 20, 75));
		students.add(new Student("Gabbar", 62, 30));
		
		students.forEach(System.out::println);
		
		// collection is the interface and collections is algorithm
		
//		Collections.sort(students, (a,b)->{return a.getName().compareTo(b.getName());});
		
		// reverse sorting (descending)
//		Collections.sort(students, (a,b)->{return b.getName().compareTo(a.getName());});
		
		//sort on age (ascending)
		Collections.sort(students, (a,b)->{return (a.getAge() - b.getAge());});
		
		System.out.println("----sorting Alphabetically----");
		students.forEach(System.out::println);
		
		
		
		
	}

}
