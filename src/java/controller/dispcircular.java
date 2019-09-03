package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DBHandlers.DaoMVC;
import com.mysql.cj.Session;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.noticeBeans;
import model.usersBeans;


@WebServlet(urlPatterns = {"/dispcircular"})
public class dispcircular extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession session=request.getSession();
        
        System.out.println("in dispcircular ");
        
//        List <noticeBeans> nlist;
//        nlist = DaoMVC.displayNotice(ub);
      

        List circulars;
        circulars = DaoMVC.displayCircular();
        //session.setAttribute("noticeList",nlist);
        //session.setAttribute("nname",uname);
        
        session.setAttribute("circulars",circulars);
        
                
                
                
        response.sendRedirect("viewcirculartable.jsp");
//		try 
//		{                                                
//                     
//			if()
//			{
//				System.out.println("notice found sucessfully");
//				
//				response.sendRedirect("Welcome.jsp");
//				
//               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
//			}
//			else
//			{
//				System.out.println("notice not found");
//                //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
//			}
//		} 
//                
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
                
          

    }

    
}
