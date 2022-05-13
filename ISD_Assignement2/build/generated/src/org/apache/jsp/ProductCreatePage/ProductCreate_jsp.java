package org.apache.jsp.ProductCreatePage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.*;
import uts.isd.model.dao.*;
import uts.isd.controller.*;

public final class ProductCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"ProductCreate.css\">\n");
      out.write("        <title>ProductCreate Page</title>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"pc_tit\">IotBay System</h1>\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"pc_cb\">\n");
      out.write("            <p class=\"pc_cb_tit\">Create Product</p>\n");
      out.write("            <div class=\"pc_cb_tb\">\n");
      out.write("                <table class=\"pc_cb_tb_con\">\n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"width: 15%\">Id</th>\n");
      out.write("                    <th style=\"width: 30%\">Name</th>\n");
      out.write("                    <th style=\"width: 25%\">Type</th>\n");
      out.write("                    <th style=\"width: 15%\">Price</th>\n");
      out.write("                    <th style=\"width: 15%\">Quantity</th>\n");
      out.write("                </tr>\n");
      out.write("            ");

            GetProductController db = new GetProductController();
            Product [] pdata = new Product[db.getpdata().length];
            pdata = db.getpdata();
                for(int i=0; i<db.getpdata().length; i++){
                    if(pdata[i]!=null){
      out.write("\n");
      out.write("                    <tr class=\"pc_cb_tb_con_data\">\n");
      out.write("                        <td style=\"width: 15%\">");
      out.print(pdata[i].getPid());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 30%\">");
      out.print(pdata[i].getPname() );
      out.write("</td>\n");
      out.write("                        <td style=\"width: 25%\">");
      out.print(pdata[i].getType() );
      out.write("</td>\n");
      out.write("                        <td style=\"width: 15%\">");
      out.print(pdata[i].getPrice() );
      out.write("</td>\n");
      out.write("                        <td style=\"width: 15%\">");
      out.print(pdata[i].getQuantity() );
      out.write("</td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
} 
                }
            
      out.write("   \n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"ProductCreateDone.jsp\" method=\"post\"><div class=\"pc_add_cb\">\n");
      out.write("                <table class=\"pc_add_tb\">            \n");
      out.write("                        <tr>\n");
      out.write("                        <td style=\"width: 10%\"><input style=\"width: 90%\" name=\"pid\" placeholder=\"Id\" required=\"true\"/></td>\n");
      out.write("                        <td style=\"width: 30%\"><input style=\"width: 90%\" name=\"pname\" placeholder=\"Product Name\" required=\"true\"/></td>\n");
      out.write("                        <td style=\"width: 30%\"><input style=\"width: 90%\" name=\"type\" placeholder=\"Product Type\" required=\"true\"/></td>\n");
      out.write("                        <td style=\"width: 15%\"><input style=\"width: 90%\" name=\"price\" placeholder=\"Price\" required=\"true\"/></td>\n");
      out.write("                        <td style=\"width: 15%\"><input style=\"width: 90%\" name=\"quantity\" placeholder=\"Quantity\" required=\"true\"/></td>    \n");
      out.write("                    </tr>      \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("                <button class=\"pc_cb_btn\" type=\"submit\">Add new product</button>\n");
      out.write("            </form> \n");
      out.write("            <a class=\"pc_btn_dou\" href=\"ProductDelete.jsp\">Delete</a>\n");
      out.write("            <a class=\"pc_btn_dou\" href=\"ProductUpdate.jsp\">Edit</a>\n");
      out.write("            <br/>\n");
      out.write("            <a class=\"pc_cb_bk\" href=\"../CustomerInfo/CustomerInfo.jsp\">Back</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
