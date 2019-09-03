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
@WebServlet(name = "circulardownloadServlet", urlPatterns = {"/circulardownloadServlet"})
public class circulardownloadServlet extends HttpServlet {
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        System.out.println("hello");
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
        
        String CircularID = session.getAttribute("CircularID").toString();
        System.out.println("CircularID:" +CircularID);
        String fileName1 = DaoMVC.returnCircularFileName(CircularID);
        
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
