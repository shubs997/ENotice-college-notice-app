package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\t<meta charset=\"description\" content=\"travel website, best, locations\">\n");
      out.write("\t<meta name=\"author\" content=\"Shubham\">\n");
      out.write("\t<title>Notice | Home</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <header>\n");
      out.write("  <div class=\"container\">\n");
      out.write("\t  <div id=\"branding\">\n");
      out.write("\t\t  <h1><a href=\"testsite1.html\">ON<span class=\"highlight\">BAS</span></a></h1>\n");
      out.write("\t  </div>\n");
      out.write("\t  <nav>\n");
      out.write("\t\t  <ul>\n");
      out.write("\t\t\t  <li class=\"current\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t  <li><a href=\"loginadminMVC.jsp\">Admin Login</a></li>\n");
      out.write("\t\t\t  <li><a href=\"services.jsp\">About</a></li>\n");
      out.write("\t\t  </ul>\t\n");
      out.write("\t  </nav>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<section id=\"showcase\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h1>Online Notice Board automation System</h1>\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"dropdown\">\n");
      out.write(" \t\t\t\t\t<h4>Select your Department</h4>\n");
      out.write("  \t\t\t\t\t<div class=\"dropdown-content\">\n");
      out.write("  \t\t\t\t\t\t<ul>\n");
      out.write("    \t\t\t\t\t<li><a href=\"index3.jsp\">Information Technology</a></li>\n");
      out.write("    \t\t\t\t\t<li><a href=\"#\">Computer Engineering</a></li>\n");
      out.write("    \t\t\t\t\t<li><a href=\"#\">Electronics Engineering</a></li>\n");
      out.write("    \t\t\t\t\t<li><a href=\"#\">Mechanical Engineering\t</a></li>\n");
      out.write("    \t\t\t\t\t</ul>\n");
      out.write("  \t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<footer>\n");
      out.write("\t\t<p>PlacesGo, Copywright &copy; 2017</p>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
