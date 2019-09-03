<%-- 
    Document   : result
    Created on : Sep 4, 2018, 12:11:59 AM
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

        
        
        <table border="1">  
            <h1>The registration information--</h1><br>
            <tbody>
                <tr>
                    <td>First name :</td>
                    <td>${name}</td>
                </tr>
                <tr>
                    <td>Last name :</td>
                    <td>${last}</td>
                </tr>
                <tr>
                    <td>email :</td>
                    <td>${emailid}</td>
                </tr>
                <tr>
                    <td>gender :</td>
                    <td>${gend}</td>
                </tr>
                <tr>
                    <td>Department :</td>
                    <td>${dep}</td>
                </tr>
            </tbody>
        </table>
   

        
        
     
                 

    </body>
</html>
