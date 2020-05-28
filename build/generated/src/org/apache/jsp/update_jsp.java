package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

String id = request.getParameter("id");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "project";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write('\n');

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement = connection.createStatement();
String sql ="select * from post where Post_Id="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>update</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"stylesheet/updatestyle.css\" >\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <img src=\"stylesheet/Logo.png\" alt=\"sgsitslogo\" class=\"logo\">\n");
      out.write("        <h2>Shri G. S. Institute of Technology & Science, Indore</h2>\n");
      out.write("        <h3>Department of Information Technology</h3>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("        <div class=\"header-head\">\n");
      out.write("       <h1>Update Event</h1>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"wrapper\"></div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("<form method=\"post\" action=\"update-process.jsp\">\n");
      out.write("    \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Post ID:</td>\n");
      out.write("                <td><input type=\"text\" name=\"id\" value=\"");
      out.print(resultSet.getString("Post_Id") );
      out.write("\" readonly></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>Post By:</td>\n");
      out.write("    <td><input type=\"text\" name=\"User_Id\" value=\"");
      out.print(resultSet.getString("User_Id") );
      out.write("\" readonly></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>\n");
      out.write("        Title:</td>\n");
      out.write("    <td><input type=\"text\" name=\"title\" value=\"");
      out.print(resultSet.getString("Title") );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>\n");
      out.write("        Category:</td>\n");
      out.write("    <td><input type=\"text\" name=\"category\" value=\"");
      out.print(resultSet.getString("Category") );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>\n");
      out.write("        Intended_Audience:</td>\n");
      out.write("    <td><input type=\"text\" name=\"intended\" value=\"");
      out.print(resultSet.getString("Intended_Audience") );
      out.write("\"></td>\n");
      out.write("<tr>\n");
      out.write("<tr>\n");
      out.write("</div>\n");
      out.write("<!--<div class=\"main-block\">-->\n");
      out.write("    <td colspan='2'>Description:</td></tr>\n");
      out.write("<tr><td colspan=\"2\"><textarea name=\"textarea1\" rows='15' cols=\"100\">");
      out.print(resultSet.getString("Description") );
      out.write("</textarea></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>\n");
      out.write("Attachment:</td>\n");
      out.write("    <td><input type=\"file\" name=\"file\" value=\"");
      out.print(resultSet.getString("Attachment") );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<!--</div>\n");
      out.write("<div class='main-info'>-->\n");
      out.write("    <td>Created_On:</td>>\n");
      out.write("    <td><input type=\"date\" name=\"createdon\" value=\"");
      out.print(resultSet.getString("Created_On") );
      out.write("\" readonly></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>\n");
      out.write("        Expiry_Date:</td>>\n");
      out.write("    <td><input type=\"date\" name=\"expireon\" value=\"");
      out.print(resultSet.getString("Expiry_Date") );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>\n");
      out.write("isImportant:</td>\n");
      out.write("    <td><input type=\"number\" placeholder=\"0 or 1 \" name=\"isImp\" value=\"");
      out.print(resultSet.getString("isImportant") );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<div class=\"button\">\n");
      out.write("\n");
      out.write("    <!--<td colspan='2'--><input type=\"submit\" value=\"Update\">\n");
      out.write("</div>\n");
      out.write("<!--/tr-->\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("    \n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("<footer>\n");
      out.write("    \n");
      out.write("    copyright @ SGSITS IT, Indore 2020\n");
      out.write("    \n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("\n");
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
