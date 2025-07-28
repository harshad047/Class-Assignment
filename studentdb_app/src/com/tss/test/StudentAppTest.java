package com.tss.test;

import com.tss.controller.StudentController;

public class StudentAppTest {

	public static void main(String[] args) {
		
		StudentController controller = new StudentController();
		
		controller.readAllRecords();
	}

}
