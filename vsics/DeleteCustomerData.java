package com.vsics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteCustomerData {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String DELETE_CUSTOMER_RECORDS = null;
		
		int result = 0;
		try {
			 
			// load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vsics1", "vsics1234");
			// create the statement object
			st = con.createStatement();
			// prepare sql query
			DELETE_CUSTOMER_RECORDS = "delete from customer_details where cid=103";
			// send and execute the query
		   	result = st.executeUpdate(DELETE_CUSTOMER_RECORDS);
			// get the record from resultset
			if (result==0) {
				System.out.println("Record not deleted");
			}
			else {
				System.out.println("Record deleted Successfully");
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
