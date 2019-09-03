/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Shubham
 */
@WebServlet(name = "fileuploadServlet", urlPatterns = {"/fileuploadServlet"})
public class fileuploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {   
        HttpSession session = request.getSession();
        boolean isMultiPart;
        int maxFileSize = 5000*1024; //5 MB
        response.setContentType("APPLICATION/OCTET-StREAM");
        
        isMultiPart = ServletFileUpload.isMultipartContent(request);
        if(!isMultiPart){
            System.out.println("file not Uploaded");
        }
        
        DiskFileItemFactory df = new DiskFileItemFactory();
        df.setSizeThreshold(maxFileSize);
        df.setRepository(new File("C:\\temp"));
        ServletFileUpload sf = new ServletFileUpload(df);
        sf.setSizeMax(maxFileSize);
        
        try
        {
            List<FileItem> multifiles = sf.parseRequest(request);
            for(FileItem item :  multifiles)
            {
                
                if (!item.isFormField()) {
                    String feildName = item.getFieldName();
                    String fileName = item.getName();  
                    String contentType = item.getContentType();
                    boolean isInMemory = item.isInMemory();
                    long sizeInBytes = item.getSize();  
                    int lastindex = fileName.lastIndexOf("\\");
                    
                    item.write(new File("C:\\Users\\Shubham\\Documents\\NetBeansProjects\\NOTICEFP\\web\\images\\" + fileName));
                    System.out.println("File Uploaded Sucessfully! " +fileName);
                    System.out.println("fieldName:" +feildName);
                    System.out.println("contenttype:" +contentType);
                    System.out.println("isInMemory:" +isInMemory);
                    System.out.println("sizeInBytes:" +sizeInBytes);
                    System.out.println("isMultipart:" +isMultiPart);
                    System.out.println("value of last index:" +lastindex);
                    session.setAttribute("filename",fileName);
                    session.setAttribute("upmsg", "Uploaded Sucessfully");
                    response.sendRedirect("fileupload.jsp");
                }
            }
            
        }catch(Exception e){
            System.out.println("File size exceeds the configured maximum size" +e);
        }
    }
  
}
