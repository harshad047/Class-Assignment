package com.tss.controller;

import java.util.List;

import com.tss.model.Student;
import com.tss.service.StudentService;

public class StudentController {
	
	private StudentService studentService;

	public StudentController() {
		super();
		this.studentService = new StudentService();
	}
	
	public void readAllRecords() {
	    List<Student> students = studentService.readAllStudent();

	    for (Student student : students) {
	        System.out.println(
	            "Student ID: " + student.getStudentId() + " | " +
	            "Name: " + student.getStudentName() + " | " +
	            "Age: " + student.getAge() + " | " +
	            "Percentage: " + student.getPercentage() + " | " +
	            "Roll No: " + student.getRollno()
	        );
	    }
	}



}
