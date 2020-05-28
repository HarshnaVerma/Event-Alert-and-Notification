package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_002dfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>File Upload Servlet JSP JDBC MySQL Example</title>\n");
      out.write("<link\n");
      out.write(" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write(" rel=\"stylesheet\"\n");
      out.write(" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write(" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write(" <div class=\"container col-lg-6\">\n");
      out.write("  <h1 class=\"text-center\">File Upload to Database Example - Servlet JSP JDBC MySQL </h1>\n");
      out.write("  <div class=\"card\">\n");
      out.write("   <div class=\"card-body\">\n");
      out.write("    <form method=\"post\" class=\"form-group\" action=\"FileUploadServlet\"\n");
      out.write("     enctype=\"multipart/form-data\">\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"first name\">First Name: </label> <input type=\"text\"\n");
      out.write("       class=\"form-control\" name=\"firstName\" size=\"50\" />\n");
      out.write("     </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"last name\">Last Name: </label> <input type=\"text\"\n");
      out.write("       class=\"form-control\" name=\"lastName\" size=\"50\" />\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("      <label for=\"Profile Photo\">Profile Photo:</label> <input\n");
      out.write("       type=\"file\" name=\"photo\" size=\"50\" />\n");
      out.write("     </div>\n");
      out.write("     <input type=\"submit\" value=\"Save\" class=\"btn btn-success\">\n");
      out.write("    </form>\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
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
