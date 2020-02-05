package com.cts.training.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/create")
public class CreateAccount extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/cts";
		String username = "root";
		String password = "admin";
		String query = "insert into user values(?,?,?,?,?,?)";
		int id = Integer.parseInt(request.getParameter("id"));
		String usernam = request.getParameter("user");
		String passwor = request.getParameter("pass");
		String rpassword = request.getParameter("rpass");
		String email = request.getParameter("email");
		long mobile = Long.parseLong(request.getParameter("mobile"));
		PreparedStatement ps;
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, usernam);
			ps.setString(3, passwor);
			ps.setString(4, rpassword);
			ps.setString(5, email);
			ps.setLong(6, mobile);
			int result = ps.executeUpdate();
			//System.out.println(result);
			if(result==1)
			{
				rd.forward(request, responce);
			}
			else
			{
				System.out.println("Not valid user");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}