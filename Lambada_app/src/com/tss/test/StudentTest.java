package com.tss.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.tss.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Harshad",1,85));
		students.add(new Student("Mahek",2,74));
		students.add(new Student("Nikul",3,23));
		students.add(new Student("Dharmi",4,90));
		students.add(new Student("Harshil",5,51));
		students.add(new Student("Henshi",6,73));
		students.add(new Student("Harsh",7,76));
		students.add(new Student("Vinit",8,52));
		students.add(new Student("Ashish",9,86));
		students.add(new Student("Deep",10,84));

		Predicate<Student> passed = (student) -> student.getMarks() >75;
		
        Consumer<Student> congratulate = (student) -> System.out.println("Congratulations " + student.getName() + " You scored " + student.getMarks() + " marks.");
        
        for(Student student: students)
        {
        	if(passed.test(student))
        	{
        		congratulate.accept(student);
        	}
        }
	}

}
