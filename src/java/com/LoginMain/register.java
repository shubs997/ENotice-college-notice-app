package com.LoginMain;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname=request.getParameter("uname");
		String lname=request.getParameter("lname");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dept=request.getParameter("dept");
		
		
		registerDAO dao=new registerDAO();
		//if(uname.equals("shubham") && pass.equals("abc"))
		if(dao.check(uname,lname,pass,email,gender,dept))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username",uname);
			
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("register.jsp");
		
		}
	}

}
