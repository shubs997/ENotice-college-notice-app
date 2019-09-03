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
import model.hod;

/**
 *
 * @author user
 */
@WebServlet(name = "loginservlethod", urlPatterns = {"/loginservlethod"})
public class loginservlethod extends HttpServlet 
{

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
                String huname=request.getParameter("huname");
		String hpass=request.getParameter("hpassword");
		
                hod hn = new hod();
		hn.sethid(huname);
		hn.sethpassword(hpass);
		

                ResultSet rs=DaoMVC.login_hod(hn);
        	
		try 
		{
			if(rs.next())
			{
				System.out.println("login sucessfull");
				
				HttpSession session=request.getSession();
				session.setAttribute("hid",rs.getString(1));
				//session.setAttribute("hname",rs.getString(2));
				session.setAttribute("hpassword",rs.getString(2));
				//session.setAttribute("hphone",rs.getString(4));
                                
                
				response.sendRedirect("hod-main-dashboard.jsp");
				
               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			else
			{
				System.out.println("login unsucessfull");
                //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
			}
		} 
		catch (SQLException e) 
                {
			e.printStackTrace();
		}
		
    }

    
}
