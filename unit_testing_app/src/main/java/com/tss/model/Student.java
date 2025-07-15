package com.tss.model;

public class Student {
	private StudentService service;

	
	public Student(StudentService service) {
		super();
		this.service = service;
	}


	int average() {
		return service.getFinalMarks() / service.getNumberOfSubjects();
	}
}
