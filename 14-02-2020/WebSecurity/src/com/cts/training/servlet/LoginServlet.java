package com.cts.training.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet  extends HttpServlet{
	@Override
	public void  doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		RequestDispatcher rd=null;
		if(user.equalsIgnoreCase("admin")  && pass.equalsIgnoreCase("admin@123")) {
			rd=request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
	}
		else {
			out.println("<h2 style = 'color:red';> Something Went Wrong....<h2>");
			rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}
}