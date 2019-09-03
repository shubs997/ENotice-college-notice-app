<%-- 
    Document   : maindashboard
    Created on : Oct 13, 2018, 1:12:29 PM
    Author     : Shubham
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Area | Dashboard</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <link href="css/style.css" rel="stylesheet">
    
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
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
            <li><a href="index.jsp">Home</a></li>
            <li><a href="about1.html">About</a></li>
            <li><a href="services1.html">Services</a></li>
          </ul>
        </nav>
      </div>

    </header>

    <section id="breadcrumb">
      <div class="container">
        <ul class="breadcrumb">
          <li class="active">Dashboard</li>
          <a href="#">Logout</a>
           <a href="#">Welcome, ${username}</a>
        </ul>  
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <div class="list-group">
              <a href="index.html" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
              <a href="result.jsp" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> My Profile <span class="badge">#</span></a>
              <a href="updateuser.jsp" class="list-group-item"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Update My Profile <span class="badge">#</span></a>
              <a href="posts.html" class="list-group-item"><span class="glyphicon glyphicon-file" aria-hidden="true"></span> Circulars  <span class="badge">#</span></a>
                  <form action="dispnotice" method="POST">
                      <a href="posts.html" class="list-group-item"><span class="glyphicon glyphicon-file" aria-hidden="true"></span><input type="submit" value="Views Notices"><span class="badge">#</span></a>
                  </form>
            </div>

          
          </div>
          <div class="col-md-9">
            <!-- Website Overview -->
            
              <!-- Latest Users -->
              <div class="panel panel-default">
                
                 
                   <div class="panel-heading main-color-bg">
                             <h3 class="panel-title">REGISTRATION</h3>
                    </div>
                    
                    <div class="panel-heading">
                    <div class="panel-body">
                        <center> 
                        <table class="table table-striped table-hover">
                        <form class="quote" action="addHodServlet" method="post">        
                            <div>
                              <input type="text" name="hid" placeholder="userid"><br>
                            </div> 
                            <br>
                            <div>
                              <input type="text" name="hname" placeholder="name"><br>
                            </div>
                            <br>
                            <div>
                              <input type="password" name="hpass" placeholder="password"><br>
                            </div>  
                             <br>
                            <div>
                              <input type="password" placeholder="confirm password"><br>
                            </div>  
                             <br>
                            <button class="button_1" type="submit">Add User</button>
                        </form>
                         </table>
                          </center>       
                             
                  </div>
              </div>
          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      <p> ONBAS Copyright , &copy; 2018</p>
    </footer>

  

 