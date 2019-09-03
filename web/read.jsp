<%-- 
    Document   : read
    Created on : Sep 8, 2018, 12:35:25 AM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <% String table =  session.getAttribute("table").toString();  %>
    </head>
    <body>
        Welcome ${username}
        
        <h1>Personal Information -</h1>
        <%= table  %>
        <!--${table}-->
        ${name}
    </body>
</html>
