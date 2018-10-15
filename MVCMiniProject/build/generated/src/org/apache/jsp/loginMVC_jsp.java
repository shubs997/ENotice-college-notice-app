package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginMVC_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("    <meta name=\"description\" content=\"Affordable and professional web design\">\n");
      out.write("    <meta name=\"keywords\" content=\"web design, affordable web design, professional web design\">\n");
      out.write("    <meta name=\"author\" content=\"Brad Traversy\">\n");
      out.write("    <title>Notice Board | Login</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <header>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div id=\"branding\">\n");
      out.write("          <h1><a href=\"testsite1.html\">ON<span class=\"highlight\">BAS</span></a></h1>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <nav>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"about1.html\">About</a></li>\n");
      out.write("            <li><a href=\"services1.html\">Services</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section id=\"main\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <article id=\"main-col\">\n");
      out.write("            <div class=\"dark\">\n");
      out.write("            <h3>LOGIN WITH YOUR STUDENT ACCOUNT</h3>\n");
      out.write("            <form class=\"quote\" action=\"loginServlet\" method=\"post\">        \n");
      out.write("              <div>   \n");
      out.write("                <input type=\"text\" name=\"uname\" placeholder=\"Username / Email Address\"><br>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <input type=\"password\" name=\"pass\" placeholder=\"Password\"><br>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <br>\n");
      out.write("              <button class=\"button_1\" type=\"submit\">Login</button>\n");
      out.write("              <label><a href=\"register.jsp\">  Not Registered? Register here</a></label>\n");
      out.write("           </form>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("\n");
      out.write("        <aside id=\"sidebar\">\n");
      out.write("         \n");
      out.write("        </aside>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("<section id=\"newsletter\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h1>Subscribe To Our Newsletter</h1>\n");
      out.write("        <form>\n");
      out.write("          <input type=\"email\" placeholder=\"Enter Email...\">\n");
      out.write("          <button type=\"submit\" class=\"button_1\">Subscribe</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <footer>\n");
      out.write("      <p>Acme Web Deisgn, Copyright &copy; 2017</p>\n");
      out.write("    </footer>    \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
