package com.tss.controller;

import java.util.List;
import java.util.Scanner;

import com.tss.model.Student;
import com.tss.service.StudentService;

public class StudentController {

	private StudentService studentService;
	private Scanner scanner = new Scanner(System.in);

	public StudentController() {
		super();
		this.studentService = new StudentService();
	}

	public void readAllRecords() {
		List<Student> students = studentService.readAllStudent();

		for (Student student : students) {
			System.out.println("Student ID: " + student.getStudentId() + " | " + "Name: " + student.getStudentName()
					+ " | " + "Age: " + student.getAge() + " | " + "Percentage: " + student.getPercentage() + " | "
					+ "Roll No: " + student.getRollno());
		}
	}

	public void addNewStudent() {

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

		Student student = new Student(studentId, name, age, percentage, rollNo);

        studentService.addStudent(student);

        System.out.println("Student added successfully!\n");
	}

}
