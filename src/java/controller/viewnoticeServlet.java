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
@WebServlet(name = "viewnoticeServlet", urlPatterns = {"/viewnoticeServlet"})
public class viewnoticeServlet extends HttpServlet 
{

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            //Pass Execution to doPost
            doPost(request, response);
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
          {
              HttpSession session=request.getSession();

              String NoticeID = request.getParameter("NoticeID");
              String uname=session.getAttribute("name").toString();

              usersBeans ub=new usersBeans();
              ub.setName(uname);

              List viewn;
              viewn = DaoMVC.viewNotice(NoticeID,ub);

              views_functionality(NoticeID,ub,uname);

              session.setAttribute("viewn",viewn);
              session.setAttribute("NoticeID",NoticeID);
              response.sendRedirect("viewnotice1.jsp");
          }

          private void views_functionality(String NoticeID, usersBeans ub, String uname) 
          {
              List viewlist = DaoMVC.getUserViews(NoticeID);
              String users = viewlist.toString();
              users = users.substring(1,users.length() - 1);

              System.out.println("trimmed users before:" +users);
              System.out.println("\n\n\nnotice : " +NoticeID+"  Viewed by user: "+uname);
              System.out.println("list of users before(in string):" +users);
              System.out.println("index of "+uname+ "in String" +users+ "is" +users.indexOf(uname));
              System.out.println("list of users before:" +viewlist);

              if(users.contains(uname) == false)   //executes if user is not already present in "list of users" in the table
              {
                  users=users.concat(","+uname);
                  System.out.println("\n\nusers after concatenation:" +users);
                  viewlist.add(users);    
              }

              System.out.println("list of users after:" +viewlist);
              int i=DaoMVC.insertUserInViews(NoticeID,users);    
          }


}

