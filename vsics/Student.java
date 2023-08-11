package com.vsics;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    public static void main(String[] args) throws ClassNotFoundException,
    SQLException {
		//step-1  Translator (load the driver class)
    	
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	
    	//Step-2:- Path (Connection object)
    	
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
    			"vsics", "vsics123");
    	System.out.println("is this object of Connection ? "+con.getClass());
    	//step-3: Vehicle (Sttement object)
    	
    	Statement st= con.createStatement();
    	
    	System.out.println("hello");
    	
    	System.out.println("is this object of Statement ? "+st.getClass());
    	//step-4:  requirement (SQL query)
    	
    	String query="select * from student where collegename='VSICS'";
    	
    	//step-5 send and execute sql query to database and fetch the record into Resultset
    	
    	ResultSet rs=st.executeQuery(query);
    	System.out.println("is this object of ResultSet ? "+rs.getClass());
    	while(rs.next()!=false) {
    		System.out.println(rs.getInt(1));
    		System.out.println(rs.getString(2));
    		System.out.println(rs.getString(3));
    		System.out.println(rs.getString(4));
    	}
    	
    	rs.close();
	}
}
