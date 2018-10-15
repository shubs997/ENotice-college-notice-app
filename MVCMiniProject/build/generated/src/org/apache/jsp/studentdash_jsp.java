package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentdash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    <meta name=\"description\" content=\"Affordable and professional web design\">\r\n");
      out.write("\t  <meta name=\"keywords\" content=\"web design, affordable web design, professional web design\">\r\n");
      out.write("  \t<meta name=\"author\" content=\"Brad Traversy\">\r\n");
      out.write("    <title>NOTICES | Services</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("      \r\n");
      out.write("       ");

  /*
  	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//http 1.1 
  	response.setHeader("pragma","no-cache"); //http 1.0
  	response.setHeader("Expires","0"); //proxy server
  
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
  */
    
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    <header>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div id=\"branding\">\r\n");
      out.write("          <h1><a href=\"testsite1.html\">ON<span class=\"highlight\">BAS</span></a></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <nav>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"testsite1.html\">Home</a></li>\r\n");
      out.write("            <li><a href=\"about1.html\">About</a></li>\r\n");
      out.write("            <li class=\"current\"><a href=\"services1.html\">Services</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"dashrow\">\r\n");
      out.write("      <div class=\"container\"> \r\n");
      out.write("      \r\n");
      out.write("      <ul>\r\n");
      out.write("          <h4>Dashboard</h4>\r\n");
      out.write("          <li><a href=\"#\">Logout</a></li>\r\n");
      out.write("          <li><a href=\"#\">Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("      </ul> \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section id=\"maindash\">\r\n");
      out.write("   <!--  <h4 id=\"labeldash\">Dashboard</h4> -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"sidedark\">\r\n");
      out.write("         <ul>\r\n");
      out.write("            <h3 id=\"dashcolor\"><a href=\"index.html\">Dashboard</a></h3>\r\n");
      out.write("            <li><a href=\"result.jsp\">My Profile</a></li><hr>\r\n");
      out.write("            <li><a href=\"posts.html\">Change Password</a></li><hr>\r\n");
      out.write("            <li><a href=\"users.html\">Notifications</a></li><hr>\r\n");
      out.write("            \r\n");
      out.write("            <form action=\"dispnotice\" method=\"POST\">\r\n");
      out.write("                <input type=\"submit\" class='submit' value=\"Notices\">\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      <article id=\"main-sec\">\r\n");
      out.write("            <h3>Your Notices can be Viewed here</h3>\r\n");
      out.write("            <table border=\"1\" cellpadding=\"7%\"  style=\"width: 50%\">  \r\n");
      out.write("            <br>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Title</th>\r\n");
      out.write("                    <th>Body</th>\r\n");
      out.write("                    <th>Priority</th>\r\n");
      out.write("                    <th>Users</th>\r\n");
      out.write("                    <th>Files</th>\r\n");
      out.write("                    <th>Actions</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>  \r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"newsletter\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <h1>Subscribe To Our Newsletter</h1>\r\n");
      out.write("        <form>\r\n");
      out.write("          <input type=\"email\" placeholder=\"Enter Email...\">\r\n");
      out.write("          <button type=\"submit\" class=\"button_1\">Subscribe</button>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("      <p>Acme Web Deisgn, Copyright &copy; 2017</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("s");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${students}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td width=\"20%\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.body}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.priority}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.stlUserStrings}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>  \r\n");
          out.write("                    <td width=\"20%\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.files}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td>\r\n");
          out.write("                       <a href=\"viewnoticeServlet?NoticeID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">View</a>\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
