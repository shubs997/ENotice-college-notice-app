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
    
    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">AdminStrap</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.html">Dashboard</a></li>
            <li><a href="pages.html">Pages</a></li>
            <li><a href="posts.html">Posts</a></li>
            <li><a href="users.html">Users</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome ${name}</a></li>
            <li><a href="login.html">Logout</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
            <h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard <small>Manage Your Site</small></h1>
          </div>
          <div class="col-md-2">
            <div class="dropdown create">
              <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                Create Content
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li><a type="button" data-toggle="modal" data-target="#addPage">Add Page</a></li>
                <li><a href="#">Add Post</a></li>
                <li><a href="#">Add User</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </header>

    <section id="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li class="active">Dashboard</li>
        </ol>
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
                <div class="panel-heading">
                  <h3 class="panel-title">All Notices</h3>
                </div>
                <div class="panel-body">
                    <table class="table table-striped table-hover">  
                       <tbody>

                           <c:forEach var="v" items="${viewn}">
                           <tr>
                               <td>Notice Title:</td>
                               <td>${v.title}</td>
                           </tr>

                           <tr>
                               <td>Notice Body:</td>
                               <td>${v.body}</td>
                           </tr>

                           <tr>
                               <td>Notice Priority:</td>
                               <td>${v.priority}</td>
                           </tr>

                           <tr>
                               <td>Sent to Users:</td>
                               <td>${v.stlUserStrings}</td>
                           </tr> 

                           <tr>
                               <td>Files Attached:</td>
                               <td>${v.files}</td>
                           </tr>
   
                           </c:forEach>


                       </tbody>
                   </table>
            <div class="img-formatting">       
                    <c:forEach var="v" items="${viewn}">   
                       <h6>click to enlarge image</h6>
                       <a type="button" data-toggle="modal" data-target="#addPage"><img src="images/${v.files}"  alt="  Click to Download File" width="200px" height="250px" style="float: left;margin-top: -10px; margin-left:300px " ></a>
                   </c:forEach>
            </div>
            
 <div class="modal fade" id="addPage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
        <form>
                
                <div class="modal-header">
                   <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <c:forEach var="v" items="${viewn}">    
                            <img src="images/${v.files}" alt="" width="50%" height="50%" style="margin-top: -10px;" >
                         </c:forEach>
                    <div class="modal-footer">
                      
                      
                      <a href="filedownloadServlet?NoticeID=${s.title}" class="btn btn-primary">Download</a>
                      
                      <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                 </div>
        </form>

    </div>
  </div>
</div>  
                    
            
                </div>
                  
              </div>
          </div>
        </div>
      </div>
    </section>

    <footer id="footer">
      <p> ONBAS Copyright , &copy; 2018</p>
    </footer>

    <!-- Modals -->

    <!-- Add Page -->
    <div class="modal fade" id="addPage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form>
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Page</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Page Title</label>
          <input type="text" class="form-control" placeholder="Page Title">
        </div>
        <div class="form-group">
          <label>Page Body</label>
          <textarea name="editor1" class="form-control" placeholder="Page Body"></textarea>
        </div>
        <div class="checkbox">
          <label>
            <input type="checkbox"> Published
          </label>
        </div>
        <div class="form-group">
          <label>Meta Tags</label>
          <input type="text" class="form-control" placeholder="Add Some Tags...">
        </div>
        <div class="form-group">
          <label>Meta Description</label>
          <input type="text" class="form-control" placeholder="Add Meta Description...">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </form>
    </div>
  </div>
</div>

  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
