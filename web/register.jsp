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
            <div class="dark">
            <h3>REGISTRATION</h3>
            <form class="quote" action="register" method="post">        
               <div>
                <input type="text" name="uname" placeholder="firstname"><br>
              </div>  
              <div>
                <input type="text" name="lname" placeholder="lastname"><br>
              </div> 
              <div>
                <input type="password" name="pass" placeholder="password"><br>
              </div>  
               <div>
                <input type="password" placeholder="confirm password"><br>
              </div>  
              <div>   
                <input type="email" name="email" placeholder="Email Address"><br>
              </div>
              <div>
                <input type="text" name="gender" placeholder="gender"><br>
              </div>  
              <div>
                <input type="text" name="dept" placeholder="department"><br>
              </div> 
              <button class="button_1" type="submit">Register</button>
          </form>
          </div>
        </article>

        <aside id="sidebar">
         
        </aside>
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
    
    
    
    
    
    
    
    
    
    
    
<h1>Please Register</h1>
<form action="register" method="post">
	Enter firstname:<input type="text" name="uname"><br><br>
	Enter lastname:<input type="text" name="lname"><br><br>
	Enter Password:<input type="password" name="pass"><br><br>
	Enter Email:<input type="text" name="email"><br><br>	
	Enter gender:<input type="text" name="gender"><br><br>
	Enter Department:<input type="text" name="dept"><br><br>
	
	<input type="submit" value="Register">
</form>



</body>
</html>