package com.tss.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockitoSession;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {

	private StudentService studentService;
	private Student student;
	
	@BeforeEach
	void init()
	{
		studentService = Mockito.mock(StudentService.class);
		student = new Student(studentService);
	}
	@Test
	void testAverage() {
		Mockito.when(studentService.getFinalMarks()).thenReturn(450);
		Mockito.when(studentService.getNumberOfSubjects()).thenReturn(9);
		
		assertEquals(50, student.average());
	}

}
