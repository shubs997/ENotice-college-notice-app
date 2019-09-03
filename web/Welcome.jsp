<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h4>Welcome to my Demo JSP project</h4>
      
  
  <%
  
  	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//http 1.1 
  	response.setHeader("pragma","no-cache"); //http 1.0
  	response.setHeader("Expires","0"); //proxy server
  
	if(session.getAttribute("hid")==null || session.getAttribute("hid")=="")
	{
		response.sendRedirect("loginMVC.jsp");
	}
    %>
    <br>
    Welcome ${name}
    
    <a href="videos.jsp">Videos Here..</a>
    <br><br>
    <a href="result.jsp">My Profile</a><br><br>
    <a href="updateuser.jsp">Update My Profile</a><br><br>
    <form action="dispnotice" method="POST">
           <input type="submit" value="Views Notices">
    </form>
    
    
    <br><br>
    <form action="logout" method="post">
    	<br><br>
    	<input type="submit" value="logout">
    </form>
    
   
</body>
</html>