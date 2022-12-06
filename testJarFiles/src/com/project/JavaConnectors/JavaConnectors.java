package com.project.JavaConnectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnectors {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/bank ";
		String userName="root";
		String password="123456";
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is established successfully");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		}

}
