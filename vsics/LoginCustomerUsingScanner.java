package com.vsics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginCustomerUsingScanner {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String LOGIN_CUSTOMER_QUERY = null;
		Scanner scanner = null;
		ResultSet rs = null;
		int id = 0, result = 0;
		String pass = null;

		try {
			scanner = new Scanner(System.in);
			System.out.println("Please enter customer id");
			id = scanner.nextInt();
			System.out.println("Please enter customer password");
			pass = scanner.next();
			pass = "'" + pass + "'";

			// load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vsics1", "vsics1234");
			// create the statement object
			st = con.createStatement();
			// prepare sql query
			LOGIN_CUSTOMER_QUERY = "select count(*) from customer_details where  cid=" + id + " and password=" + pass;

			System.out.println(LOGIN_CUSTOMER_QUERY);
			// send and execute the query
			rs = st.executeQuery(LOGIN_CUSTOMER_QUERY);
			// get the record from resultset
			if (rs.next() != false) {
				result = rs.getInt(1);
			}
			if (result == 0) {
				System.out.println("Invalid username or password");
			} else {
				System.out.println("Valid Credentials");
			}
			// handling known exception
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// handling unknown exception
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				scanner.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
