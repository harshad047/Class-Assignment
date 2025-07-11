package com.tss.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Employee {
	private int empid;
	private String name;
	private LocalDate joiningDate;
	private int salary;
	private double bonus;
	private int experienceYears;

	public Employee() {
	    this.empid = 1;
	    this.name = "Harshad";
	    this.salary = 100000;
	    this.joiningDate = LocalDate.of(2020, 1, 1);
	    setExperienceYears();
	    setBonus();
	}
	public Employee(int empid, String name, String joiningDateStr, int salary) {
	    this.empid = empid;
	    this.name = name;
	    this.salary = salary;

	    try {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        this.joiningDate = LocalDate.parse(joiningDateStr, formatter);
	    } catch (Exception e) {
	        System.out.println("Invalid date format. Please use yyyy-MM-dd.");
	        this.joiningDate = LocalDate.now();
	    }

	    setExperienceYears();
	    setBonus();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			this.joiningDate = LocalDate.parse(joiningDate, formatter);
		} catch (Exception e) {
			System.out.println("Invalid date format. Please use yyyy-MM-dd.");
			this.joiningDate = LocalDate.now(); // or set to null if preferred
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears() {
		this.experienceYears = Period.between(this.joiningDate, LocalDate.now()).getYears();
	}

	public void setBonus() {
		this.bonus = this.salary * 0.5;
	}

	public double getBonus() {
		return bonus;
	}

	public void display() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Employee Id: " + getEmpid());
		System.out.println("Employee Name: " + getName());
		System.out.println("Emmploye's Joining Date: " + getJoiningDate());
		System.out.println("Employee Salary: " + getSalary());
		System.out.println("Employee Experience: " + getExperienceYears()+" years");
		System.out.println("Employee Bonus: " + getBonus());
		System.out.println("--------------------------------------------------------------------");
	}
}
