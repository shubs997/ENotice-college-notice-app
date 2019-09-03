 package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBHandlers.DaoMVC;
import model.usersBeans;



@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {

		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		usersBeans ub=new usersBeans();
		ub.setName(uname);
		ub.setPass(pass);
		

        ResultSet rs=DaoMVC.loginUser(ub);
        	
		try 
		{
			if(rs.next())
			{
				System.out.println("login sucessfull");
				
				HttpSession session=request.getSession();
                                session.setAttribute("sid",rs.getString(1));
				session.setAttribute("name",rs.getString(2));
				session.setAttribute("last",rs.getString(3));
				session.setAttribute("pass",rs.getString(4));
				session.setAttribute("emailid",rs.getString(5));
                                session.setAttribute("gend",rs.getString(6));
                                session.setAttribute("dep",rs.getString(7));
                                
				response.sendRedirect("maindashboard.jsp");
				
               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			else
			{
				System.out.println("login unsucessfull");
                //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
