package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    
	//A Connection is a session between a Java application and a database. 
	//It helps to establish a connection with the database.
	private static Connection conn;
	
	
	public static Connection getConn()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","1234");
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
}
