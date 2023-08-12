package com.vsics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateCustomerData {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String UPDATE_CUSTOMER_RECORDS = null;
		
		int result = 0;
		try {
			 
			// load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vsics1", "vsics1234");
			// create the statement object
			st = con.createStatement();
			// prepare sql query
			UPDATE_CUSTOMER_RECORDS = "update customer_details set caddress='Jhansi' where cid=103";
			// send and execute the query
		   	result = st.executeUpdate(UPDATE_CUSTOMER_RECORDS);
			// get the record from resultset
			if (result==0) {
				System.out.println("Record not updated");
			}
			else {
				System.out.println("Record updated Successfully");
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
