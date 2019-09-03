/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import model.admin;
/**
 *
 * @author user
 */
@WebServlet(name = "loginservletadmin", urlPatterns = {"/loginservletadmin"})
public class loginservletadmin extends HttpServlet 
{

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
                String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		admin an =new admin();
		an.setid(uname);
		an.setpassword(pass);
		
        

        ResultSet rs=DaoMVC.login_admin(an);
        	
		try 
		{
			if(rs.next())
			{
				System.out.println("login sucessfull");
				
				HttpSession session=request.getSession();
				session.setAttribute("id",rs.getString(1));
				session.setAttribute("password",rs.getString(2));
				
                
				response.sendRedirect("admin-main-dashboard.jsp");
				
               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			else
			{
				System.out.println("login unsucessfull");
                                response.sendRedirect("loginadminMVC.jsp");
                //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
			}
		} 
		catch (SQLException e)
                {
			e.printStackTrace();
		}
    }

    
    
}
