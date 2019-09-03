<%-- 
    Document   : choose
    Created on : Oct 14, 2018, 9:20:48 PM
    Author     : Shantanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
	<meta name="viewport" content="width=device-width">
	<meta charset="description" content="travel website, best, locations">
	<meta name="author" content="Shubham">
	<title>Notice | Home</title>
	<link rel="stylesheet" type="text/css" href="style.css">
    <style>
    .column {
    float: left;
    width: 24%;
    padding: 50px;
    
}

/* Clearfix (clear floats) */
.row::after {
    content: "";
    clear: both;
    display: table;
}    
    </style>
    
    </head>
    <body>
 <header>
  <div class="container">
	  <div id="branding">
		  <h1><a href="testsite1.html">ON<span class="highlight">BAS</span></a></h1>
	  </div>
	  <nav>
		  <ul>
			  <li class="current"><a href="index.jsp">Home</a></li>
			  <li><a href="about.jsp">About</a></li>
			  <li><a href="services.jsp">Services</a></li>
		  </ul>	
	  </nav>
  </div>
</header>


	<section id="showcase">
		<div class="container">
			<h1>Choose Your login</h1>
                        <br><br>
                        <div class="row">
                            <div class="column">
                                <a href="loginhodMVC.jsp"><img src="images/hod.png" style="width:50%"></a>
                                <p style="text-align:center;">HOD</p>
                            </div>
                            <div class="column">
                                <a href="loginstfMVC.jsp"><img src="images/stf1.png" style="width:50%" ></a>
                                <a href="loginMVC.jsp"><p style="text-align:center; color:ghostwhite;">STAFF</p></a>
                            </div>
                            <div class="column">
                              <a href="loginstdMVC.jsp"><img src="images/std1.png" style="width:50%"></a>
                              <p style="text-align:center;">STUDENT</p>
                            </div>
                          </div>

			
		</div>

	</section>
	
	

	

	<footer>
		<p><a>ON<span class="highlight">BAS</span></a>, Copyright &copy; 2018</p>
	</footer>

        
    </body>
</html>
