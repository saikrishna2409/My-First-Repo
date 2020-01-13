package javaapp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
public class EmployMain{
	public static void main(String[] args)throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username ="root";
		String password="krishna";
		Connection conn =DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		
	}
}