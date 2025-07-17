package com.tss.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.tss.model.Employee;

public class ComparatorExample {
	public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Liam", "Finance", 75000),
            new Employee("Olivia", "Engineering", 80000),
            new Employee("Ethan", "Engineering", 75000),
            new Employee("Sophia", "Marketing", 75000),
            new Employee("Mason", "Finance", 85000)
        );

        employees.sort(
            Comparator.comparing(Employee::getSalary).reversed()
                      .thenComparing(Employee::getName)
        );

        employees.forEach(System.out::println);
        
        Map<String, Employee> highestPaidByDept = employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        Optional::get
                    )
                ));

            highestPaidByDept.forEach((dept, emp) -> 
                System.out.println(dept + " => " + emp)
            );
    }
	
}
