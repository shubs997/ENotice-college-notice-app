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
@WebServlet(name = "viewnoticestaffServlet", urlPatterns = {"/viewnoticestaffServlet"})
public class viewnoticestaffServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
      //Pass Execution to doPost
      doPost(request, response);
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession session=request.getSession();
        
        String NoticeID = request.getParameter("NoticeID");
        
       List viewlist = DaoMVC.getUserViews(NoticeID);
       
        String vlst=viewlist.toString();
        
        vlst = vlst.substring(2,vlst.length() - 1);
        System.out.println("\n\n\n\n nnnlist in viewnoticestaff:" +vlst);
        List viewn;
        viewn = DaoMVC.viewStaffNotice(NoticeID);
                     
        session.setAttribute("viewn",viewn);
        session.setAttribute("userslist",vlst);
        session.setAttribute("NoticeID",NoticeID);
        System.out.println("attribute is set");
        response.sendRedirect("viewnoticestaff.jsp");
    }

    
}

