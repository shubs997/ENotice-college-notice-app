/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBHandlers.DaoMVC;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "viewcircularStaffServlet", urlPatterns = {"/viewcircularStaffServlet"})
public class viewcircularStaffServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
      //Pass Execution to doPost
      doPost(request, response);
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession session=request.getSession();
        
        String CircularID = request.getParameter("CircularID");
        
        
        List viewc;
        viewc = DaoMVC.viewCircularStaff(CircularID);
        
        System.out.println("data addad in viewc");
        
        session.setAttribute("viewc",viewc);
        session.setAttribute("CircularID",CircularID);

        String cid = session.getAttribute("CircularID").toString();
        System.out.println("CircularID set in session:"+cid);
        response.sendRedirect("viewcircular.jsp");
    }

    
}

