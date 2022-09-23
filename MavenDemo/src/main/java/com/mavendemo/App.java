package com.mavendemo;

import java.sql.Connection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
//	    try {
//	    	Connection connect = DBConnector.getConnection();
//	    	System.out.println("Connection successful");
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
    	
    	
//    	try {
//    		StudentDao sd = new StudentDao();
//    		List<StudentDto> li = sd.getAllStudent();
//    		li.forEach(System.out::println);
// 			
// 		} catch (Exception e) {
// 			System.out.println(e.getMessage());
// 		}
    	
//    	try {
//    		StudentDao sd = new StudentDao();
//    		StudentDto stud = new StudentDto();
//    		stud.setStudentid("5");
//    		sd.getAnyStudent(stud);
//    		System.out.println(stud);
//    		
//    	} catch (Exception e) {
//    		System.out.println(e.getMessage());
//    	}
    	
    	
    	try {
    		StudentDao sd = new StudentDao();
    		StudentDto stud = new StudentDto();
    		stud.setStudentid("7");
    		stud.setfName("Krish");
    		stud.setlName("Mehara");
    		sd.addStudent(stud);
    		System.out.println("Data inserted :) !");
    		
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    }
}
