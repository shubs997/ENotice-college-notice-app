<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%
	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//http 1.1 
	response.setHeader("pragma","no-cache"); //http 1.0
	response.setHeader("Expires","0"); //proxy server
	
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("login.jsp");
		}

%>
	
<iframe width="560" height="315" src="https://www.youtube.com/embed/_00TpbhJQxk" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
</body>
</html>