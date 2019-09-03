/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBHandlers.DaoMVC;
import java.io.IOException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.noticeBeans;


@WebServlet(urlPatterns = {"/publishServlet" })


public class publishServlet extends HttpServlet 
{

    
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        HttpSession session=request.getSession();
        System.out.println("In publishServlet");
        String title=request.getParameter("title");
        String body=request.getParameter("body");
        String priority=request.getParameter("priority");
        String[] sltuser=request.getParameterValues("sltUser");
        
        System.out.println("title:" +title);
        System.out.println("body:" +body);
        System.out.println("priority:" +priority);
        
        System.out.println("Users in Servlet:"+Arrays.toString(sltuser));
        
        noticeBeans nb=new noticeBeans();
                nb.setTitle(title);
                nb.setBody(body);
                nb.setPriority(priority);
                nb.setSltUser(sltuser);
                
                
                if(session.getAttribute("filename") == null)
                {
                    nb.setFiles("null");
                }
                else
                {
                    nb.setFiles(session.getAttribute("filename").toString());
                }
                
        int i=DaoMVC.storeNotice(nb);     
        
        if(i!=0)
                {
                     System.out.println("value inserted");
                        
                     
 //                    session.setAttribute("username",uname);
                     session.setAttribute("sucessmsg", "Notice published Sucessfully!");
                     response.sendRedirect("noticepublish.jsp"); //redirect user to login.jsp

                }
                else
                {
                    session.setAttribute("sucessmsg", "Notice not published");
                    System.out.println("value not inserted"); //data insertion failed
                    response.sendRedirect("noticepublish.jsp"); //redirect user to register.jsp
                }    
    }

    
}
