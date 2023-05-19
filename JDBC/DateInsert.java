package com.bytecode.jdbc.standard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsertApp {

	public static void main(String[] args) {
		Connection con = null;
		String INSERT_STUDENT_RECORD = null;
		PreparedStatement ps = null;
		Scanner scanner = null;
		String name = null, address = null;

		String dob = null, doa = null, doj = null;

		java.sql.Date sqldob = null, sqldoa = null, sqldoj = null;

		SimpleDateFormat sdf1 = null, sdf2 = null;

		java.util.Date udoa = null, udoj = null;

		long ms1 = 0, ms2 = 0;

		int result = 0;

		// load the driver class

		try {

			scanner = new Scanner(System.in);
			System.out.println("Enter student name ::");

			name = scanner.next();

			System.out.println("Enter student address ::");

			address = scanner.next();

			System.out.println("Enter student dob in mysql date format YYYY-MM-DD ::");

			dob = scanner.next();

			System.out.println("Enter student doa :: dd-MM-yyyy");

			doa = scanner.next();

			System.out.println("Enter student doj :: MM-dd-yy");

			doj = scanner.next();

			// date conversion

			// if its mysql then use below steps to convert in java.sql.Date format

			sqldob = java.sql.Date.valueOf(dob);

			// else follow this steps

			sdf1 = new SimpleDateFormat("dd-MM-yyyy");

			udoa = sdf1.parse(doa);// converted into util date but required sql date

			ms1 = udoa.getTime();

			sqldoa = new java.sql.Date(ms1);

			sdf2 = new SimpleDateFormat("MM-dd-yy");

			udoj = sdf2.parse(doj);// converted into util date but required sql date

			ms2 = udoj.getTime();

			sqldoj = new java.sql.Date(ms2);

			Class.forName("oracle.jdbc.driver.OracleDriver");

			// create COnnection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bytecode1", "bytecode1");

			// prepare sql query
			INSERT_STUDENT_RECORD = "insert into student values(student_id.nextval,?,?,?,?,?)";

			// create PreparedStatement object

			if (con != null) {
				ps = con.prepareStatement(INSERT_STUDENT_RECORD);
			}

			// set input values to pre compiled sql query means ps object [place holde |
			// place resolver]

			if (ps != null) {
				ps.setString(1, name);
				ps.setString(2, address);
				ps.setDate(3, sqldob);
				ps.setDate(4, sqldoa);
				ps.setDate(5, sqldoj);

				result = ps.executeUpdate();
			}

			if (result == 0) {
				System.out.println("Student record not inserted...");
			}

			else {
				System.out.println("Record inserted...");
			}

			// handling known exception
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// handling unknown exceptions

		catch (Exception e) {
			e.printStackTrace();
		}

		// close the connections
		finally {

			try {
				ps.close();
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
		} // finally

	}// main

}// class
