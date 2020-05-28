package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"https://cdn.ckeditor.com/4.13.1/standard/ckeditor.js\"></script>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"stylesheet/astyle.css\" >   \n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("   ");

String title = request.getParameter("Title");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "project";
String userId = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("    \n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navigation-bar1\">\n");
      out.write("            <img class=\"logo\" src=\"stylesheet/Logo.png\">\n");
      out.write("<!--            <h2 style=\"color: black; \">Shri G. S. Institute of Technology and Science, Indore</h2>-->\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Name</i></a>\n");
      out.write("            <a href=\"#post\"><i class=\"fa fa-file\"></i> View Post</a>\n");
      out.write("            <a href=\"studentdash.jsp\"><i class=\"fa fa-university\"></i> Dashboard</a>\n");
      out.write("            \n");
      out.write("        </nav>    \n");
      out.write("    </header>\n");
      out.write("    <div class=\"main\">  \n");
      out.write("        <div class=\"container1\" id=\"id0a\">\n");
      out.write("            <form method=\"post\" id=\"form1\" action=\"UploadServlet\" enctype=\"multipart/form-data\">\n");
      out.write("                <table class=\"table\" style=\"margin:auto;\">\n");
      out.write("                    <th colspan=\"2\"><b>ADD EVENT</b></th>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align:left\">Add Title : </b><input name=\"title\" type=\"text\" placeholder=\"title\"></td>\n");
      out.write("                        <td style=\"text-align:right\">\n");
      out.write("                            <label for=\"category\">Category :</label>\n");
      out.write("                            <select id=\"category\" name=\"category\">\n");
      out.write("                                \n");
      out.write("                                <option value=\"Official Clubs\">Official Clubs</option>\n");
      out.write("                                <option value=\"Workshops\">Workshops</option>\n");
      out.write("                                <option value=\"Trainings\">Trainings</option>\n");
      out.write("                                <option value=\"Academia\">Academia</option>\n");
      out.write("                                <option value=\"Sports\">Sports</option>\n");
      out.write("                                <option value=\"Training and Placements\">Training & Placements</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <textarea name=\"textarea1\" rows=\"15\" cols=\"100\" placeholder=\"Add your content here...\">\n");
      out.write("                    </textarea>\n");
      out.write("                            <script>\n");
      out.write("                                CKEDITOR.replace('textarea1');\n");
      out.write("                            </script>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td style=\"text-align:left\">\n");
      out.write("                            Intended Audience :<br>\n");
      out.write("   \n");
      out.write("                            <input type=\"checkbox\" id = \"audience\" name=\"intended\" value=\"First\">\n");
      out.write("                            <label for=\"firstyear\">Ist Year </label>\n");
      out.write("                            <input type=\"checkbox\" id = \"audience\" name=\"intended\" value=\"Second\">\n");
      out.write("                            <label for=\"secondyear\">II Year</label>\n");
      out.write("                            <input type=\"checkbox\" id = \"audience\" name=\"intended\" value=\"Third\">\n");
      out.write("                            <label for=\"thirdyear\">III Year</label>\n");
      out.write("                            <input type=\"checkbox\" id = \"audience\" name=\"intended\" value=\"Fourth\">\n");
      out.write("                            <label for=\"fourthyear\">IV Year</label><br>\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"text-align:right\">\n");
      out.write("                            Is Important: <br>\n");
      out.write("                            <input type=\"radio\" id=\"yes\" name=\"isImp\" value=\"1\">\n");
      out.write("                            <label for=\"yes\">Yes</label>\n");
      out.write("                            <input type=\"radio\" id=\"no\" name=\"isImp\" value=\"0\">\n");
      out.write("                            <label for=\"no\">No</label>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align:left\">\n");
      out.write("                            <label for=\"createdon\">Date of Creation:</label>\n");
      out.write("                            <input type=\"date\" id=\"createdon\" name=\"createdon\">\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"text-align:right\">\n");
      out.write("                            <label for=\"expireon\">Expiry Date:</label>\n");
      out.write("                            <input type=\"date\" id=\"expireon\" name=\"expireon\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align: left\">Attachments : <input type=\"file\" id=\"myFile\" name=\"filename\"></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align: center\" colspan=\"2\"><button class=\"postbutton\" onclick=\"UploadServlet\"><b>POST</b> </button></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>   \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("      </div>  \n");
      out.write("\n");
      out.write("<div style=\"margin:15%\" class=\"container11\">\n");
      out.write("    <center><h2>Events</h2></center>\n");
      out.write("    <hr>\n");
      out.write("    <table class=\"table1\">\n");
      out.write("        <thead>\n");
      out.write("            <tr class=\"tr1\">\n");
      out.write("                <th class=\"th1\">ID</th>\n");
      out.write("                <th class=\"th1\">Title</th>\n");
      out.write("                <th class=\"th1\">From</th>\n");
      out.write("                <th class=\"th1\">To</th>\n");
      out.write("                <th class=\"th1\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                      String sql ="SELECT * FROM post ";
                           resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      
      out.write("\n");
      out.write("            <tr class=\"tr1\">\n");
      out.write("                <td name='id'>");
      out.print(resultSet.getString("Post_Id") );
      out.write("</td>\n");
      out.write("                <td class=\"td1\"><a href=\"#w\" class=\"important\">\n");
      out.write("                           ");
      out.print(resultSet.getString("Title") );
      out.write("     \n");
      out.write("                            <br>\n");
      out.write("                                 </a>\n");
      out.write("                </td>\n");
      out.write("                <td class=\"td1\">");
      out.print(resultSet.getString("Created_On") );
      out.write("</td>\n");
      out.write("                <td class=\"td1\">");
      out.print(resultSet.getString("Expiry_Date") );
      out.write("</td>\n");
      out.write("               \n");
      out.write("                <td class=\"td1\"><button><a href=\"update.jsp\">Update</a></button>\n");
      out.write("\n");
      out.write("                    <button>Delete</button></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"td1\"> </td>\n");
      out.write("                <td class=\"td1\"> </td>\n");
      out.write("                <td class=\"td1\"> </td>\n");
      out.write("                <td class=\"td1\">  </td>\n");
      out.write("                <td class=\"td1\"> </td>\n");
      out.write("            </tr>\n");
      out.write("             ");
 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    </div>  \n");
      out.write("<footer>\n");
      out.write("    <center> Copyright @ SGSITS IT, 2020</center> \n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
