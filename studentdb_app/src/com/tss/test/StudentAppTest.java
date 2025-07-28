package com.tss.test;

import java.util.Scanner;
import com.tss.controller.StudentController;

public class StudentAppTest {

	public static void main(String[] args) {

		StudentController controller = new StudentController();
		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean loop = true;

		while (loop) {
			System.out.println("\n===== Student Management Menu =====");
			System.out.println("1. Add New Student");
			System.out.println("2. View All Students");
			System.out.println("3. Read Student By Id");
			System.out.println("4. Update Student Percentage By Id");
			System.out.println("5. Delete Student By Id");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				controller.addNewStudent();
				break;
			case 2:
				controller.readAllRecords();
				break;
			case 3:
				controller.readStudentById();
				break;
			case 4:
				controller.updateStudentPercentage();
				break;
			case 5:
				controller.deleteStudentById();
				break;
			case 6:
				loop = false;
				System.out.println("Exiting...!");
				break;
			default:
				System.out.println("Invalid choice.");
			}

		}
		scanner.close();

	}
}
