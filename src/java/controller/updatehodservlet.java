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
import model.hod;
/**
 *
 * @author user
 */
@WebServlet(name = "updatehodservlet", urlPatterns = {"/updatehodservlet"})
public class updatehodservlet extends HttpServlet
{

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
                String hid=request.getParameter("hid");
                String hname=request.getParameter("hname");
		String hpass=request.getParameter("hpass");
		String hno=request.getParameter("hphone");
		String hdept=request.getParameter("hdeptname");
		
                
                
        //2. set the valuse in model class
                HttpSession session=request.getSession();
                hod  hd=new hod();
                
                hd.sethid(hid);
                hd.sethname(hname);
                hd.sethpassword(hpass);
                hd.sethphone(hno);
                hd.sethdeptname(hdept);
                
        
        //3.pass model class objct to DAO class method
        
               // String str="update newuser set(firstname,lastname,password,email,gender,department)=(?,?,?,?,?,?) where firstname=?";
                
                
                String str="update hod set hname=?,hpassword=?,hphone=?,hdeptname=? where hid=?";
                int i=DaoMVC.updatehod(hd);
                
                if(i!=0)
                {
                    
                    session.setAttribute("hid",hid);
                    session.setAttribute("hname",hname);
                    session.setAttribute("hpassword",hpass);
                    session.setAttribute("hphone",hno);
                    session.setAttribute("hdeptname",hdept);
                    
                         
                    System.out.println("Updated sucessfully");
                    session.setAttribute("msg", "User Profile Updated Sucessfully!");
                    response.sendRedirect("updatehod.jsp");                  
                }
                else
                {
                    System.out.println("not Updated");
                    session.setAttribute("msg", "User Profile Not Updated");
                     response.sendRedirect("updatehod.jsp");
                }   
    }

  

}
