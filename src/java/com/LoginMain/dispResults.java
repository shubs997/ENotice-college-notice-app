/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LoginMain;

import com.mysql.cj.Session;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.usersBeans;

/**
 *
 * @author Shubham
 */
@WebServlet(name = "dispResults", urlPatterns = {"/dispResults"})
public class dispResults extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession session=request.getSession();
        String un=session.getAttribute("username").toString();
        //System.out.println(un);
        
        //to send session or any string to other class 
        dispResultDAO dr= new dispResultDAO();
        dr.doRead(un);
        
        String table=dr.getHTMLTable();
        session.setAttribute("table", table);
        
        response.sendRedirect("read.jsp");
        //RequestDispatcher rd = request.getRequestDispatcher("read.jsp");
       // rd.forward(request, response);
        
//        String name=request.getParameter("first");
//        String last=request.getParameter("last");
//        String emailid=request.getParameter("email");
//        String gend=request.getParameter("gender");
//        String dept=request.getParameter("dept");
//        
//        
//        request.setAttribute("name",name);
//        request.setAttribute("last",last);
//        request.setAttribute("emailid",emailid);
//        request.setAttribute("gend",gend);
//        request.setAttribute("dep",dept);
//        
//        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
//        rd.forward(request, response);




        usersBeans ub=new usersBeans();
        String name=ub.getName();
        System.out.println("name1" +name);
        //RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        //request.setAttribute("name", name);
        //rd.forward(request, response);
        
        
    }

}
