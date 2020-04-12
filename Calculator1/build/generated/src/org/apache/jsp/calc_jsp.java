package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <script src=\"jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <script src=\"calc.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"calc.jsp\" method=\"POST\">\r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th >RATHISH CALCULATOR</th>\r\n");
      out.write("                       \r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Enter 1st Number</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"n1\" id=\"number1\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Enter 2nd Number</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"n2\" id=\"number2\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        \r\n");
      out.write("                         <td><input type=\"radio\" name=\"op\"  id=\"plus\" value=\"+\" onclick=\"cal()\">ADD<br></td>\r\n");
      out.write("                         <td><input type=\"radio\" name=\"op\"  id=\"min\" value=\"-\" onclick=\"cal()\">SUBTRACT<br></td>\r\n");
      out.write("                         \r\n");
      out.write("                              \r\n");
      out.write("                        \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><input type=\"radio\" name=\"op\"  id=\"mul\" value=\"*\" onclick=\"cal()\">MULTIPLY<br></td>\r\n");
      out.write("                         <td><input type=\"radio\" name=\"op\" id=\"div\" value=\"/\" onclick=\"cal()\">DIVIDE<br></td>\r\n");
      out.write("                        \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td><input type=\"radio\" name=\"op\" id=\"mod\" value=\"m\" onclick=\"cal()\">MODULO<br></td>     \r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"result\"></div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("      \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("    </body>\r\n");
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
