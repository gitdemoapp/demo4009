package com.bytecode.ps.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPSDemo1 {

	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String user = "bytecode1";
	public static final String password = "bytecode1";

	public static void main(String[] args) {

		// defining all variables
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String INSERT_CUSTOMER_DETAILS = 
				"insert into customer values(customerID.nextval,?,?)";
		// int customerID = 0;
		Scanner scanner = null;
		String customerName = null, customerAddress = null;
		int result = 0;

		// ? ->place holder or place resolver

		// load the driver class

		try {

			scanner = new Scanner(System.in);

			/*
			 * System.out.println("Please enter customer id to insert in db");
			 * 
			 * customerID = scanner.nextInt();
			 */

			System.out.println("Please enter customer name to insert in db");

			customerName = scanner.next();

			System.out.println("Please enter customer address to insert in db");

			customerAddress = scanner.next();

			Class.forName("oracle.jdbc.driver.OracleDriver");

			// create Connection object

			connection = DriverManager.getConnection(url, user, password);

			// prepare sql query

			// create Statement object--->now we are going to use PreparedStatement
			if (connection != null) {
				preparedStatement = 
						connection.prepareStatement(INSERT_CUSTOMER_DETAILS);

			}
			// set values to place holder

			if (preparedStatement != null) {
				// preparedStatement.setInt(1, customerID);
				preparedStatement.setString(1, customerName);
				preparedStatement.setString(2, customerAddress);

				// send pre compiled sql query and execute

				result = preparedStatement.executeUpdate();
			}
			if (result == 0) {
				System.out.println("Record not  inserted successfully ");
			} else {
				System.out.println("Record not  inserted successfully  ");
			}

			// Handling known exception
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		// handling unknown exception
		catch (Exception e) {
			e.printStackTrace();
		}

		// close all connections in reverse order

		finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

			try {
				if (scanner != null) {
					scanner.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}

		} // finally

	}// main

}// class
