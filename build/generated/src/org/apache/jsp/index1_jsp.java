package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"GetBookServlet\" method=\"post\" ENCTYPE=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("<tr><td> title</td><td><input type=\"text\" name=\" title\"></td></tr>\n");
      out.write("<tr><td>author</td><td><input name=\"author\" style=\"width:180px;height:30px\"></td></tr>\n");
      out.write("<tr><td>image</td><td><input type=\"file\" name=\"image\"  ></td></tr>\n");
      out.write("<tr><td>description</td><td><input name=\"description\" style=\"width:180px;height:30px\"></td></tr>\n");
      out.write("<tr><td>isbn</td><td><input name=\"isbn\" style=\"width:180px;height:30px\"></td></tr>\n");
      out.write("<tr><td>price</td><td><input name=\"price\" style=\"width:180px;height:30px\"></td></tr>\n");
      out.write("<tr><td>publish_date</td><td><input name=\"publish_date\" style=\"width:180px;height:30px\"></td></tr>\n");
      out.write("<tr><td>category_id</td><td><input name=\"category_id\" style=\"width:180px;height:30px\"></td></tr>\n");
      out.write("<tr><td>last_update_on</td><td><input name=\"last_update_on\" style=\"width:180px;height:30px\"></td></tr>\n");
      out.write("\n");
      out.write("<tr><td><input type=\"submit\" value=\"submit\"></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
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
