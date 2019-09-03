/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBHandlers.DaoMVC;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.usersBeans;

/**
 *
 * @author user
 */
@WebServlet(name = "updatestudentservlet", urlPatterns = {"/updatestudentservlet"})
public class updatestudentservlet extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   throws ServletException, IOException 
    {
                String sid=request.getParameter("sid");
                String sname=request.getParameter("sname");
		String spass=request.getParameter("spass");
                String sclass=request.getParameter("sclass");
		String sphone=request.getParameter("sphone");
                String sdept=request.getParameter("sdept");
		//String tdept=request.getParameter("tdeptname");
		
                
                
        //2. set the valuse in model class
                HttpSession session=request.getSession();
                usersBeans ub =new usersBeans();
                
                ub.setName(sid);
                ub.setLast(sname);
                ub.setPass(spass);
                ub.setEmailid(sclass);
                ub.setGend(sphone);
                ub.setDept(sdept);
                //sn.setDept(tdept);
                
        
        //3.pass model class objct to DAO class method
        
               // String str="update newuser set(firstname,lastname,password,email,gender,department)=(?,?,?,?,?,?) where firstname=?";
                
                
                String str="update newuser set lastname=?,password=?,email=?,gender=?,department=? where firstname=?";
                int i=DaoMVC.updateUser(ub);
                
                if(i!=0)
                {
                    
                    session.setAttribute("name",sid);
                    session.setAttribute("last",sname);
                    session.setAttribute("pass",spass);
                    session.setAttribute("emailid",sclass);
                    session.setAttribute("gend",sphone);
                    session.setAttribute("dept",sdept);
                    
                         
                    System.out.println("Updated sucessfully");
                    session.setAttribute("msg", "User Profile Updated Sucessfully!");
                    response.sendRedirect("updatestudent.jsp");                  
                }
                else
                {
                    System.out.println("not Updated");
                    session.setAttribute("msg", "User Profile Not Updated");
                     response.sendRedirect("updatestudent.jsp");
                }   

    }

   
}
