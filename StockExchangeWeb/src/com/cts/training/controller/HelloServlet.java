package com.cts.training.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws IOException {
		PrintWriter out = responce.getWriter();
		String username=request.getParameter("User");
		String password=request.getParameter("Password");
		out.println("Username:"+username);
		out.println("<br>Password:"+password);
	}
}