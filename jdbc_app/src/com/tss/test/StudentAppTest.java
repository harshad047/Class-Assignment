package com.tss.test;

import java.sql.Connection;

import com.tss.database.DBConnection;

public class StudentAppTest {

	public static void main(String[] args) {
		
		Connection connection = DBConnection.connect();
	}

}
