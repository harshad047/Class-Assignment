package com.tss.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection;

	private DBConnection() {

	}

	public static Connection connect() {
		try {
			if (connection == null) {

				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tss_students_db", "root",
						"Fggv@676");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
