package com.tss.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.tss.model.Customer;

public class LoanProcessingSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		Supplier<List<Customer>> customerSupplier = () -> {
			 List<Customer> customers = new ArrayList<>();
	            System.out.print("How many customers do you want to add? ");
	            int count = scanner.nextInt();
	            scanner.nextLine(); 

	            for (int i = 0; i < count; i++) {
	                System.out.println("Enter details for customer " + (i + 1) + ":");
	                
	                System.out.print("Name: ");
	                String name = scanner.nextLine();
	                
	                System.out.print("Age: ");
	                int age = scanner.nextInt();
	                
	                System.out.print("Salary: ");
	                double salary = scanner.nextDouble();
	                
	                System.out.print("Credit Score: ");
	                int creditScore = scanner.nextInt();
	                scanner.nextLine(); // consume leftover newline
	                
	                customers.add(new Customer(name, age, salary, creditScore));
	            }
	           return  customers;
		};

		Predicate<Customer> iseligible = (customer) ->customer.getAge()>=21 && customer.getCreditScore()>=650 && customer.getIncome()>=25000;
	
		Function<Customer, Double> calculateLoanAmount = customer -> customer.getIncome() * (customer.getCreditScore() / 1000.0);
		
		Consumer<Customer> approvalPrinter = (customer) -> {
			double amount = calculateLoanAmount.apply(customer);
			System.out.println("Loan Approved For "+customer.getName()+"! Amount Of Loan is: ₹"+amount);
		};
		
		List<Customer> customers = customerSupplier.get();
		
		for(Customer customer:customers)
		{
			if(iseligible.test(customer))
			{
				approvalPrinter.accept(customer);
			}
		}
	}

}
