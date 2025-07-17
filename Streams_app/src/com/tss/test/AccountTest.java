package com.tss.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.tss.model.Account;

public class AccountTest {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account(1, "mahek", 5000));
        accounts.add(new Account(2, "ashish", 7000));
        accounts.add(new Account(3, "deep", 4500));
        accounts.add(new Account(4, "harshad", 8000));
        accounts.add(new Account(5, "hemanshi", 4000));

        // Find min salary account
        Account min = accounts.stream()
                .min(Comparator.comparingDouble(account -> account.getSalary()))
                .orElse(null);

        // Find max salary account
        Account max = accounts.stream()
                .max(Comparator.comparingDouble(account -> account.getSalary()))
                .orElse(null);

        System.out.println("Min Salary Account: " + min.toString());
        System.out.println("Max Salary Account: " + max.toString());

        // Filter accounts with name length > 6
        List<String> longNames = accounts.stream()
                .filter(account -> account.getName().length() > 6)
                .map(account -> account.getName())
                .collect(Collectors.toList());

        System.out.println("\nAccounts with name length > 6: " + longNames);

        // Total salary
        double totalSalary = accounts.stream()
                .mapToDouble(account -> account.getSalary())
                .sum();

        System.out.println("Total Salary: " + totalSalary);
    }
}
