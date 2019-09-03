<%-- 
    Document   : maindashboard
    Created on : Oct 13, 2018, 1:12:29 PM
    Author     : Shubham
--%>

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
  
  	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//http 1.1 
  	response.setHeader("pragma","no-cache"); //http 1.0
  	response.setHeader("Expires","0"); //proxy server
  
	if(session.getAttribute("tid")==null)
	{
		response.sendRedirect("loginstfMVC.jsp");
	}
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
          <a href="logout">Logout</a>
           <a href="#">Welcome, Teacher ${tid}</a>
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
              <a href="addstudent.jsp" class="list-group-item"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Add Student <span class="badge">#</span></a>
              <a href="circularpublishstaff.jsp" class="list-group-item"><span class="glyphicon glyphicon-file" aria-hidden="true"></span> Publish Circular  <span class="badge">#</span></a>
              <a href="noticepublish.jsp" class="list-group-item"><span class="glyphicon glyphicon-file" aria-hidden="true"></span> publish Notice  <span class="badge">#</span></a>
              <a href="returnCountServlet" class="list-group-item"><span class="glyphicon glyphicon-file" aria-hidden="true"></span> Get Students count  <span class="badge">#</span></a>
                 

                  <form action="dispnoticestaff" method="POST" class="fdesign">
                      <a class="list-group-item"><span class="glyphicon glyphicon-list-alt  " aria-hidden="true"></span><input type="submit" value="View all Notices"><span class="badge">#</span></a>
                  </form>
        </div>

          
          </div>
          <div class="col-md-9">
            <!-- Website Overview -->
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Publish a Circular</h3>
              </div>
              
              
           
            <div class="container">
                <article id="main-col23" style="margin-left: 200px">
                            <label>${sucessmsg}</label><br>
                            
                        <div class="panel-body">
                            <form class="quote1" action="publishCircularServlet" method="post">        
                               <div>
                                <label>Title</label><br>
                                <input type="text" name="title" placeholder="Notice Title">
                              </div>
                                <br>
                              <div>
                                <label>Description</label><br>
                                <textarea name="body" placeholder="Notice Body"></textarea>
                              </div>
                                <br>
                              <div>
                                <label>Priority</label>
                                <select name="priority">
                                    <option value="High">High</option>
                                    <option value="Medium">Medium</option>
                                    <option value="Low">Low</option>
                                </select>
                              </div>  
                                <br>
                               <div>
                                   <label>Upload File</lasbel><br>
                                   <iframe src="fileupload.jsp" height="120" width="400" style="border:none;"></iframe>
                               </div> 

                            <br>
                              <button class="button_1" type="submit">Publish</button>
                          </form>
                        </div>
                        </article>

                       
                      </div>

                </div>
          </div>
        </d iv>
      </div>
    </section>

    <footer id="footer">
      <p> Copyright  ONBAS, &copy; 2018</p>
    </footer>

    <!-- Modals -->

    <!-- Add Page -->

 

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
