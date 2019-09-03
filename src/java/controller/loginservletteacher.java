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
import model.teacher;
/**
 *
 * @author user
 */
@WebServlet(name = "loginservletteacher", urlPatterns = {"/loginservletteacher"})
public class loginservletteacher extends HttpServlet 
{

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
                String tid=request.getParameter("tid");
		String tpassword=request.getParameter("tpassword");
		
		teacher tn =new teacher();
		tn.settid(tid);
		tn.settpassword(tpassword);
                System.out.println("tid in loginservlet:" +tn.gettid());
		
        

        ResultSet rs=DaoMVC.login_teacher(tn);
        int i=DaoMVC.returnStudentCount();
        int i2=DaoMVC.returnNoticeCount();
        int i3=DaoMVC.returnCircularCount();
		try 
		{
			if(rs.next())
			{
				System.out.println("login sucessfull");
				
				HttpSession session=request.getSession();
				session.setAttribute("tid",rs.getString(1));
				//session.setAttribute("tname",rs.getString(2));
				session.setAttribute("pass",rs.getString(3));
				//session.setAttribute("subject",rs.getString(4));
                                //session.setAttribute("tphone",rs.getString(5));
                                
                                session.setAttribute("count", i);
                                session.setAttribute("noticecount", i2);
                                session.setAttribute("circularcount", i3);
                                
                                
                                
				response.sendRedirect("staff-main-dashboard.jsp");
				
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
