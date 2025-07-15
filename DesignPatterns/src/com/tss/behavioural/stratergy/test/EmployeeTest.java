package com.tss.behavioural.stratergy.test;

import com.tss.behavioural.stratergy.model.Consultant;
import com.tss.behavioural.stratergy.model.Employee;
import com.tss.behavioural.stratergy.model.SeniorConsultant;
import com.tss.behavioural.stratergy.model.TechLead;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe", new Consultant());
        printEmployeeDetails(employee);

        employee.promote(new SeniorConsultant());
        System.out.println("After Promotion:");
        printEmployeeDetails(employee);

        employee.promote(new TechLead());
        System.out.println("After Second Promotion:");
        printEmployeeDetails(employee);
    }

    private static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Position: " + employee.getRoleName());
        System.out.println("Description: " + employee.getDescription());
        System.out.println("Responsibility: " + employee.getResponsibility());
    }
}
