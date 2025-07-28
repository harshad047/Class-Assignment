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
		try {
			System.out.print("Enter the student ID: ");
			int id = scanner.nextInt();

			System.out.print("Enter the roll number: ");
			int roll = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter name: ");
			String name = scanner.nextLine();
			if (name == null) {
				System.out.println("Name cannot be blank.");
				return;
			}

			System.out.print("Enter age: ");
			int age = scanner.nextInt();
			if (age <= 0 || age > 100) {
				System.out.println("Age must be between 1 and 100.");
				return;
			}

			System.out.print("Enter percentage: ");
			double percentage = scanner.nextDouble();
			if (percentage < 0 || percentage > 100) {
				System.out.println("Percentage must be between 0 and 100.");
				return;
			}

			Student student = new Student(id, name, age, percentage, roll);
			studentService.addStudent(student);

		} catch (Exception e) {
			System.out.println("Invalid input.");
			scanner.nextLine();
		}
	}

	public void readStudentById() {
		System.out.print("Enter Student ID to search: ");
		int studentId = scanner.nextInt();

		Student student = studentService.getStudentById(studentId);

		if (student != null) {
			System.out.println("Student ID: " + student.getStudentId() + " | " + "Name: " + student.getStudentName()
					+ " | " + "Age: " + student.getAge() + " | " + "Percentage: " + student.getPercentage() + " | "
					+ "Roll No: " + student.getRollno());
		} else {
			System.out.println("Student with ID " + studentId + " not found.");
		}
	}

	public void updateStudentPercentage() {
		System.out.print("Enter Student ID to update: ");
		int studentId = scanner.nextInt();

		System.out.print("Enter new Percentage: ");
		double newPercentage = scanner.nextDouble();

		studentService.updateStudentPercentage(studentId, newPercentage);
	}

	public void deleteStudentById() {
		System.out.print("Enter Student ID to update: ");
		int student_id = scanner.nextInt();
		studentService.deleteStudentById(student_id);
	}

}
