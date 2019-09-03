 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBHandlers.DaoMVC;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.noticeBeans;

/**
 *  
 * @author Shubham
 */
@WebServlet(name = "filedownloadServlet", urlPatterns = {"/filedownloadServlet"})
public class filedownloadServlet extends HttpServlet {
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       doPost(request,response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {  
        PrintWriter out =response.getWriter();
        //String fileName = "test.pdf";
        String filePath = "C:\\Users\\Shubham\\Documents\\NetBeansProjects\\NOTICEFP\\web\\images\\";
        response.setContentType("APPLICATION/OCTET-STREAM");
        noticeBeans nb = new noticeBeans();

        
        HttpSession session=request.getSession();
        
        String NoticeID = session.getAttribute("NoticeID").toString();
        System.out.println("NOTICEID:" +NoticeID);
        String fileName1 = DaoMVC.returnFileName(NoticeID);
        
        System.out.println("filename is returned:" +fileName1);
        //to display first and download later
        //response.setContentType("APPLICATION/PDF");
        
        
        response.setHeader("Content-Disposition", "attachment;Filename=\""+fileName1+"\""); //change attachment to inline for type-2
        FileInputStream fi = new FileInputStream(filePath+fileName1);
        int i;
        while( (i=fi.read()) !=-1 )
                out.write(i);

        out.close();
        fi.close();
    }

}
