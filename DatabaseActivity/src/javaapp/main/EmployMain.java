package javaapp.main;

//import java.io.FileNotFoundException;

//import javaapp.bean.dao.EmployDAO;
//import javaapp.daoimpl.EmployDAOImpl;

//import java.util.List;

//import javaapp.bean.Employ;
//import javaapp.daoimpl.EmployeeDAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.PreparedStatement;

import java.sql.DriverManager;
public class EmployMain{
	public static void main(String[] args)throws ClassNotFoundException,SQLException{	
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts1";
		String username ="root";
		String password="admin";
		Connection conn =DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		Statement stmt =conn.createStatement();
		//String query ="insert into cts2 values(105,'raju','alur')";
		//String query ="update cts2 set name='anil' where id=104";
		/*String query ="delete from cts2 where id=105";
		
		int result =stmt.executeUpdate(query);
		if(result>0)
		{
			System.out.println("Data Deleted  successfully");
		}
		else
		{
			System.out.println("Try Again");
		}*/
		String query ="select * from cts2";
		ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":"+rs.getString(3));
				}
		
		
			}
}