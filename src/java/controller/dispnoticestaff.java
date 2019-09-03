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


@WebServlet(urlPatterns = {"/dispnoticestaff"})
public class dispnoticestaff extends HttpServlet {


 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession session=request.getSession();
        
        
//        List <noticeBeans> nlist;
//        nlist = DaoMVC.displayNotice(ub);
      

        List studs;
        studs = DaoMVC.displayStaffNotice();
        //session.setAttribute("noticeList",nlist);
        //session.setAttribute("nname",uname);
        
        session.setAttribute("students",studs);
        
                
                
                
        response.sendRedirect("staffdash.jsp");
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
