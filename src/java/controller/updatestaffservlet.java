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
import model.teacher;
/**
 *
 * @author user
 */
@WebServlet(name = "updatestaffservlet", urlPatterns = {"/updatestaffservlet"})
public class updatestaffservlet extends HttpServlet
{

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
                String tid=request.getParameter("tid");
                String tname=request.getParameter("tname");
		String tpass=request.getParameter("tpass");
                String subject=request.getParameter("tsubject");
		String tno=request.getParameter("tphone");
		String tdept=request.getParameter("tdeptname");
		
                
                
        //2. set the valuse in model class
                HttpSession session=request.getSession();
                teacher  td=new teacher();
                
                td.settid(tid);
                td.settname(tname);
                td.settpassword(tpass);
                td.settphone(tno);
                td.settdeptname(tdept);
                
        
        //3.pass model class objct to DAO class method
        
               // String str="update newuser set(firstname,lastname,password,email,gender,department)=(?,?,?,?,?,?) where firstname=?";
                
                
                String str="update hod set hname=?,hpassword=?,hphone=?,hdeptname=? where hid=?";
                int i=DaoMVC.updatestaff(td);
                
                if(i!=0)
                {
                    
                    session.setAttribute("hid",tid);
                    session.setAttribute("hname",tname);
                    session.setAttribute("hpassword",tpass);
                    session.setAttribute("hphone",tno);
                    session.setAttribute("hdeptname",tdept);
                    
                         
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
