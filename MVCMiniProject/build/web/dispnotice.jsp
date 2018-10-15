<%-- 
    Document   : dispnotice
    Created on : Sep 30, 2018, 2:10:50 PM
    Author     : Shubham
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Notices:</h3>


        <c:forEach var="s" items="${students}">
            ${s.title}
            ${s.body}
            ${s.priority}
            ${s.stlUserStrings}
            <br>
            
            
            
        </c:forEach>
    </body>
</html>
