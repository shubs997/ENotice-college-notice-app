<%-- 
    Document   : fileupload
    Created on : Oct 1, 2018, 11:36:40 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <form action="fileuploadServlet" method="post" enctype="multipart/form-data">
            <input type="file" name="file" multiple/>
            <input type="submit"> 
            
        </form>
        <p>Only png and jpg allowed</p>
        ${filename} ${upmsg}
        
        
    </body>
</html>
    