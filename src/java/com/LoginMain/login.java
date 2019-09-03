package com.LoginMain;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
                    
		loginDAO dao=new loginDAO();
		//if(uname.equals("shubham") && pass.equals("abc"))
		if(dao.check(uname, pass))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username",uname);
			
			response.sendRedirect("studentdash.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
                       // PrintWriter out=new 
		
		}
	}

}
