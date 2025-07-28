package com.tss.test;

import com.tss.database.Database;
import com.tss.model.Student;
import java.util.Scanner;

public class DBTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database db = new Database();

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        System.out.print("Enter Student Name: ");
        scanner.nextLine(); 
        String studentName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        Student student = new Student(studentId, studentName, age, percentage, rollNo);

        db.addStudent(student);
        db.readAllStudents();

        scanner.close();
    }
}
