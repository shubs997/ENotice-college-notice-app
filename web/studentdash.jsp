<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Affordable and professional web design">
	  <meta name="keywords" content="web design, affordable web design, professional web design">
  	<meta name="author" content="Brad Traversy">
    <title>NOTICES | Services</title>
    <link rel="stylesheet" href="style.css">
  </head>
  
  
  
  <body>
      
       <%
  /*
  	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//http 1.1 
  	response.setHeader("pragma","no-cache"); //http 1.0
  	response.setHeader("Expires","0"); //proxy server
  
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
  */
    %>
      
    <header>
      <div class="container">
        <div id="branding">
          <h1><a href="testsite1.html">ON<span class="highlight">BAS</span></a></h1>
        </div>
        <nav>
          <ul>
            <li><a href="testsite1.html">Home</a></li>
            <li><a href="about1.html">About</a></li>
            <li class="current"><a href="services1.html">Services</a></li>
          </ul>
        </nav>
      </div>
    </header>

    <section id="dashrow">
      <div class="container"> 
      
      <ul>
          <h4>Dashboard</h4>
          <li><a href="#">Logout</a></li>
          <li><a href="#">Welcome, ${username}</a></li>
      </ul> 
  </div>

    </section>



    <section id="maindash">
   <!--  <h4 id="labeldash">Dashboard</h4> -->

      <div class="container">
        <div class="sidedark">
         <ul>
            <h3 id="dashcolor"><a href="index.html">Dashboard</a></h3>
            <li><a href="result.jsp">My Profile</a></li><hr>
            <li><a href="posts.html">Change Password</a></li><hr>
            <li><a href="users.html">Notifications</a></li><hr>
            
            <form action="dispnotice" method="POST">
                <input type="submit" class='submit' value="Notices">
            </form>
            
          </ul>
        </div>
      <article id="main-sec">
            <h3>Your Notices can be Viewed here</h3>
            <table border="1" cellpadding="7%"  style="width: 50%">  
            <br>
            <tbody>
                <tr>
                    <th>Title</th>
                    <th>Body</th>
                    <th>Priority</th>
                    <th>Users</th>
                    <th>Files</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="s" items="${students}">
                <tr>
                    <td>${s.title}</td>
                    <td width="20%">${s.body}</td>
                    <td>${s.priority}</td>
                    <td>${s.stlUserStrings}</td>  
                    <td width="20%">${s.files}</td>
                    <td>
                       <a href="viewnoticeServlet?NoticeID=${s.title}">View</a>
                    </td>
                </tr>
                </c:forEach>
                
                
            </tbody>
        </table>
      </div>  
    </section>

  
        
        
   


<section id="newsletter">
      <div class="container">
        <h1>Subscribe To Our Newsletter</h1>
        <form>
          <input type="email" placeholder="Enter Email...">
          <button type="submit" class="button_1">Subscribe</button>
        </form>
      </div>
    </section>


    <footer id="footer">
      <p> ONBAS Copyright , &copy; 2018</p>
    </footer>
  </body>
</html>
