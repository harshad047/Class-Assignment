package com.tss.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tss.database.DBConnection;
import com.tss.model.Student;

public class StudentDao {

	private Connection connection = null;
	private Statement statement = null;
	
	public StudentDao() {
		this.connection = DBConnection.connect();
	}


	public List<Student> readAllStudents()
	{
		List<Student> students = new ArrayList<Student>();
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from students");
			
			while(result.next())
			{
				Student student = new Student();
				student.setStudentId(result.getInt("student_id"));
				student.setAge(result.getInt("age"));
				student.setPercentage(result.getDouble("percentage"));
				student.setStudentName(result.getString("student_name"));
				student.setRollno(result.getInt("rollno"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}
}
