package com.vsics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertCustomerDataUsingScanner {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String INSERT_CUSTOMER_RECORDS = null;
		Scanner scanner = null;
		int id = 0;
		long mobile = 0;
		String name = null, address = null;

		int result = 0;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Please enter customer id");
			id = scanner.nextInt();
			System.out.println("Please enter customer name");
			name = scanner.next();
			System.out.println("Please enter customer mobile number");
			mobile = scanner.nextLong();
			System.out.println("Please enter customer Address");
			address = scanner.next();
			name= "'"+name+"'";
			address= "'"+address+"'";

			// load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vsics1", "vsics1234");
			// create the statement object
			st = con.createStatement();
			// prepare sql query
			INSERT_CUSTOMER_RECORDS = "insert into customer_details values( " + id + ", " + name + ", " + mobile + ", "
					+ address + ")";
			System.out.println(INSERT_CUSTOMER_RECORDS);
			// send and execute the query
			result = st.executeUpdate(INSERT_CUSTOMER_RECORDS);
			// get the record from resultset
			if (result == 0) {
				System.out.println("Record not inserted");
			} else {
				System.out.println("Record inserted Successfully");
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
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	String INSERT_CUSTOMER_RECORDS = null;

}
