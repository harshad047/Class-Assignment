package com.tss.test;

import java.util.Scanner;
import com.tss.model.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------Employee1-------------------------------");
        Employee employee1 =new Employee();
        employee1.display();

        System.out.println("---------------------------Employee2-------------------------------");
        Employee employee2 = createEmployeeFromInput(scanner);
        employee2.display();

        scanner.close();
    }

    private static Employee createEmployeeFromInput(Scanner scanner) {
        System.out.print("Enter Id Of Employee: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Name Of Employee: ");
        String name = scanner.nextLine();

        System.out.print("Enter Joining Date Of Employee in format (yyyy-MM-dd): ");
        String joiningDate = scanner.nextLine();

        System.out.print("Enter Salary Of Employee: ");
        int salary = scanner.nextInt();
        scanner.nextLine(); 

        // Create and return Employee object using constructor
        return new Employee(empId, name, joiningDate, salary);
    }
}
