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
    <title>Notice Board | Login</title>
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
            <h3>LOGIN WITH YOUR ADMIN ACCOUNT</h3>
            <form class="quote" action="loginservletadmin" method="post">        
              <div>   
                <input type="text" name="uname" placeholder="Username / Email Address"><br>
              </div>
              <div>
                <input type="password" name="pass" placeholder="Password"><br>
              </div>

              <br>
              <button class="button_1" type="submit">Login</button>
              <label><a href="register.jsp">  Not Registered? Register here</a></label>
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
    
    <footer>
      <p>Acme Web Deisgn, Copyright &copy; 2017</p>
    </footer>    
 


    
    
    
    
    
    
    




</body>
</html>