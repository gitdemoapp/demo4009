package com.vsics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectCustomerData {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String SELECT_CUSTOMER_RECORDS = null;
		ResultSet rs = null;
		try {
			// load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vsics1", "vsics1234");
			// create the statement object
			st = con.createStatement();
			// prepare sql query
			SELECT_CUSTOMER_RECORDS = "select cid,cname,caddress from customer_details";
			// send and execute the query
			rs = st.executeQuery(SELECT_CUSTOMER_RECORDS);
			// get the record from resultset
			while (rs.next() != false) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2)+" "+rs.getString(3));
						
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
		}
	}

}
