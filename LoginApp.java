package com.bytecode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 1. Take meaningful name
 * 2. write proper comment with logic
 * 3. prefer to use try catch 
 * 4. don't hard code use soft code
 * 5. always try to define all variables at top of class
 * 6. always check reference is null or not to avoid NullPointerException
 * 
 * 
 * 
 * */
public class LoginApp {

	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "bytecode";
	public static final String PASSWORD = "bytecode";

	public static void main(String[] args) {
		
		//defining all local variables
		Connection connection = null;
		Statement statement = null;

		Scanner scanner = null;
		String QUERY_TO_CHECK_CREDENTIALS = null;
		String userName = null;
		String pass = null;
		ResultSet resultSet = null;
		int result = 0;

		String fUserName = null;
		String fPass = null;

		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter user name");
			userName = scanner.next();

			System.out.println("Enter password");
			pass = scanner.next();

			// formating input values as sql required to sql query
			fUserName = "'" + userName + "'";
			fPass = "'" + pass + "'";

			// Step-1: load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2: create the connection object

			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			// step-3: create Statement object
			if (connection != null) {
				statement = connection.createStatement();
			}

			// step-4: prepare sql query
			QUERY_TO_CHECK_CREDENTIALS = "select count(*) from user_table where uname=" + fUserName + "--and upassword="
					+ fPass;

			// step-5: send and excute sql query

			if (statement != null) {
				resultSet = statement.executeQuery(QUERY_TO_CHECK_CREDENTIALS);
			}

			if (resultSet != null) {
				if (resultSet.next() != false) {
					result = resultSet.getInt(1);
				}
			}
			if (result == 0) {
				System.out.println("Invalid credentials");
			} else {
				System.out.println("Valid credentials " + userName + "  " + pass);
			}
			// handling known exceptions
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {

			sqle.printStackTrace();
		}
		// handling unknown exception
		catch (Exception e) {
			e.printStackTrace();
		}
		//Step-6:   close the connection in finally block using reverse order
		finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (scanner != null) {
				try {
					scanner.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} // finally

	}// main

}// class
