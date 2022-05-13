package org.apache.jsp.LoginPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"Login.css\">\n");
      out.write("    <title>Login Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1 class=\"lg_tit\">Welcome to IoTBay System</h1>\n");
      out.write("<br/>\n");
      out.write("<div class=\"lg_cb\">\n");
      out.write("    <p class=\"lg_cb_tit\">Log-in</p>\n");
      out.write("    <p class=\"lg_cb_subtit\">Please enter your Username and Password</p>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <form action=\"../LoginServlet\" method=\"post\">\n");
      out.write("        <p class=\"lg_cb_iptit\">Your Email</p>\n");
      out.write("        <input class=\"lg_cb_ip\" type=\"text\" placeholder=\"Enter email\" name=\"email\" required=\"true\">\n");
      out.write("        <p class=\"lg_cb_iptit\">Your Password</p>\n");
      out.write("        <input class=\"lg_cb_ip\" type=\"password\" placeholder=\"Enter password\"name=\"password\" required=\"true\">\n");
      out.write("        </br></br>\n");
      out.write("\n");
      out.write("        <a class=\"lg_cb_fp\" href=\"../LoginPage/Admin.jsp\">System Admin Login</a>\n");
      out.write("        </br></br>\n");
      out.write("\n");
      out.write("        <a class=\"lg_cb_su\" href=\"../RegisterPage/Register.jsp\">Sign up</a>\n");
      out.write("        <br/>\n");
      out.write("        <input class=\"lg_cb_btn\" type=\"submit\" value=\"LOGIN\"/>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
