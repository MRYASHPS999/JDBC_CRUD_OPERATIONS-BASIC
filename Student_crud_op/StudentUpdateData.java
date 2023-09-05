package com.jsp.jdbc_github_upload;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdateData {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";		
		String password="root";
		
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(url, username, password);
			
			Statement statement=connection.createStatement();
			
			statement.execute("UPDATE student set email='abcde1@mail.com' WHERE id=3");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("All clear");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
