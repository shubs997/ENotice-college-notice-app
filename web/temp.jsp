<%@page import="java.util.ArrayList"%>
<%@page import="DBHandlers.DaoMVC"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Affordable and professional web design">
	  <meta name="keywords" content="web design, affordable web design, professional web design">
  	<meta name="author" content="Brad Traversy">
    <title>Notice | Register</title>
    <link rel="stylesheet" href="style.css">

</head>


<body>

    
    

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
    
    <section id="main">
      <div class="container">
        <article id="main-col">
            <label>${sucessmsg}</label>
            <h3>Publish a Notice </h3>
           
            <form class="quote" action="publishServlet" method="post">        
               <div>
                <label>Notice Title</label>
                <input type="text" name="title" placeholder="Notice Title">
              </div>  
              <div>
                <label>Notice Body</label>
                <textarea name="body" placeholder="Notice Body"></textarea>
              </div> 
              <div>
                <label>Notice Priority</label>
                <select name="priority">
                    <option value="High">High</option>
                    <option value="Medium">Medium</option>
                    <option value="Low">Low</option>
                </select>
              </div>  
                <br>
               <div>
                   <label>Upload File</lasbel>
                   <iframe src="fileupload.jsp" height="120" width="400" style="border:none;"></iframe>
               </div>
                
              <div>   
                  <label>Select Users</label><br>
                <%
                    DaoMVC  dm=new DaoMVC();
                    ArrayList arr=dm.returnUser();
                    int i=0 ;
                %>
            <select name="sltUser" multiple>
            <option disabled>----Select User-----</option>
                <%
                while(i<arr.size()) {

                %>           
                <option value="<%=arr.get(i).toString()%>"/> <%=arr.get(i).toString()%>

                <% 
                    i++;
                    }
                %>
            </select>
              </div>
              <div>
               
              </div>  
              <div>
               
              </div> 
            <br>
              <button class="button_1" type="submit">Publish</button>
          </form>
       
        </article>

        <aside id="sidebar">
         
        </aside>
      </div>
    </section>



    


</body>
</html>