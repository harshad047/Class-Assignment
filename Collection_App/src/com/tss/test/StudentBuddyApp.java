package com.tss.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentBuddyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students.add(studentName);
        }

        System.out.println("Enter the name of the student to find their buddy: ");
        String name = scanner.nextLine();

        boolean found = false;
        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            String student = iterator.next();
            if (found) {
                System.out.println(student);
            }
            if (student.equalsIgnoreCase(name)) {
                found = true;
            }
        }

      
        scanner.close();
    }
}
