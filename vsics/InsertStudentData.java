package com.vsics.insertdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentData {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		//String INSERT_STUDENT_DATA = null;
		//String DELETE_STUDENT_BY_ID= null;
		String UPDATE_STUDENT_NAME_BY_ID= null;
		int result = 0;
		try {
			// load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vsics", "vsics123");
			// create statement object
			st = con.createStatement();
			// prepare sql Query
			//INSERT_STUDENT_DATA = "insert into student values(444,'Deepak','vsics','Kanpur')";
			//DELETE_STUDENT_BY_ID="delete from student where rollnumber=444";
			  UPDATE_STUDENT_NAME_BY_ID="update student set studentname='Shyam' where rollnumber=333";
			// sent and execute the query
			result = st.executeUpdate(UPDATE_STUDENT_NAME_BY_ID);
			// result
			if (result == 0) {
				System.out.println("Record not Update");
			} else {
				System.out.println("Record Updated successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// close the connection in reverse order
		finally {
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
