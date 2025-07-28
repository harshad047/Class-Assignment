package com.tss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	private PreparedStatement prepareStatement = null;

	public StudentDao() {
		this.connection = DBConnection.connect();
	}

	public List<Student> readAllStudents() {
		List<Student> students = new ArrayList<Student>();
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from students");

			while (result.next()) {
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

	public void addNewStudent(Student student) {
		try {
			prepareStatement = connection.prepareStatement("insert into students values(?,?,?,?,?)");
			prepareStatement.setInt(1, student.getStudentId());
			prepareStatement.setString(2, student.getStudentName());
			prepareStatement.setInt(3, student.getAge());
			prepareStatement.setDouble(4, student.getPercentage());
			prepareStatement.setInt(5, student.getRollno());

			int updates = prepareStatement.executeUpdate();
			if (updates > 0) {
				System.out.println("inserted Successfully !!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Student readStudentById(int student_id) {
		Student student = null;

		try {
			prepareStatement = connection.prepareStatement("SELECT * FROM students WHERE student_id = ?");
			prepareStatement.setInt(1, student_id);

			ResultSet result = prepareStatement.executeQuery();

			if (result.next()) {
				student = new Student(result.getInt("student_id"), result.getString("student_name"),
						result.getInt("age"), result.getDouble("percentage"), result.getInt("rollno"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

	public void updateStudentPercentage(int student_id, double percentage) {
		try {
			prepareStatement = connection.prepareStatement("UPDATE students SET percentage = ? WHERE student_id = ?");
			prepareStatement.setDouble(1, percentage);
			prepareStatement.setInt(2, student_id);

			int updated = prepareStatement.executeUpdate();
			if (updated > 0) {
				System.out.println("Updated Successfully !!");
				return;
			}
			System.out.println("Student Id Not There !!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteStudentById(int student_id) {
		try {
			prepareStatement = connection.prepareStatement("DELETE FROM students WHERE student_id = ?");
			prepareStatement.setInt(1, student_id);
			int updated = prepareStatement.executeUpdate();
			if (updated > 0) {
				System.out.println("Deleted Successfully !!");
				return;
			}
			System.out.println("Student Id Not There !!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
