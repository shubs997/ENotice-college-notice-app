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
import model.usersBeans;


/**
 *
 * @author Shubham
 */
@WebServlet("/addStudentServlet")

public class addStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException        
    {
        //1. Retrive all the parameters from jsp
        
                int sid=Integer.parseInt(request.getParameter("sid"));
                String sfname=request.getParameter("sfname");
		String hslname=request.getParameter("slname");
                String spass=request.getParameter("spass");
		//String email=request.getParameter("email");
		//String gender=request.getParameter("gender");
		//String dept=request.getParameter("dept");
                
                
        //2. set the valuse in model class
                usersBeans ub = new usersBeans();
                ub.setSid(sid);
                ub.setName(sfname);
                ub.setPass(spass);
        //3.pass model class objct to DAO class method
                int i=DaoMVC.registerStudent(ub);

                if(i!=0)
                {
                     System.out.println("value inserted");
                     
                     //HttpSession session=request.getSession();
                     //session.setAttribute("username",uname);
                     
                     response.sendRedirect("addhod.jsp"); //redirect user to login.jsp

                }
                else
                {
                    System.out.println("value not inserted"); //data insertion failed
                    response.sendRedirect("addhod.jsp"); //redirect user to register.jsp
                }    
    }

}
