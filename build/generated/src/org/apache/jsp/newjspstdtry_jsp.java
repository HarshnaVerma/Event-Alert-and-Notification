package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class newjspstdtry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>CSS Template</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<script src=\"https://kit.fontawesome.com/90b9ec7b5d.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheet/sstyle.css\">\n");
      out.write("<style>\n");
      out.write("  body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("  \n");
      out.write("  input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  #login {\n");
      out.write("    background-color: #7575a3;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  #login:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .container {\n");
      out.write("    padding: 16px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  span.psw {\n");
      out.write("    float: right;\n");
      out.write("    padding-top: 16px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .modal {\n");
      out.write("    display: none; \n");
      out.write("    position: fixed; \n");
      out.write("    z-index: 1; \n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%; \n");
      out.write("    height: 100%; \n");
      out.write("    overflow: auto; \n");
      out.write("    background-color: rgb(0,0,0);\n");
      out.write("    background-color: rgba(0,0,0,0.4);\n");
      out.write("    padding-top: 60px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .modal-content {\n");
      out.write("    background-color: #d9b38c;\n");
      out.write("    margin: 5% auto 15% auto; \n");
      out.write("    border: 3px solid black;\n");
      out.write("    border-radius: 3%;\n");
      out.write("    width: 50%; \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* The Close Button (x) */\n");
      out.write("  .close {\n");
      out.write("    position: absolute;\n");
      out.write("    right: 25px;\n");
      out.write("    top: 0;\n");
      out.write("    color: #000;\n");
      out.write("    font-size: 35px;\n");
      out.write("    font-weight: bold;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .close:hover,\n");
      out.write("  .close:focus {\n");
      out.write("    color: red;\n");
      out.write("    cursor: pointer;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* Add Zoom Animation */\n");
      out.write("  .animate {\n");
      out.write("    -webkit-animation: animatezoom 0.6s;\n");
      out.write("    animation: animatezoom 0.6s\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  @-webkit-keyframes animatezoom {\n");
      out.write("    from {-webkit-transform: scale(0)} \n");
      out.write("    to {-webkit-transform: scale(1)}\n");
      out.write("  }\n");
      out.write("    \n");
      out.write("  @keyframes animatezoom {\n");
      out.write("    from {transform: scale(0)} \n");
      out.write("    to {transform: scale(1)}\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* Change styles for span and cancel button on extra small screens */\n");
      out.write("  @media screen and (max-width: 300px) {\n");
      out.write("    span.psw {\n");
      out.write("       display: block;\n");
      out.write("       float: none;\n");
      out.write("    }\n");
      out.write("    .cancelbtn {\n");
      out.write("       width: 100%;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

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
      out.write("\n");
      out.write("<header>\n");
      out.write("<img src = \"img/Logo.png\" alt = \"sgsitslogo\">\n");
      out.write("  <h1>Event Alerts and Notification</h1>\n");
      out.write("  ");
 
      if (session != null) {
         if (session.getAttribute("user") != null) {
            String name = (String) session.getAttribute("user");
            out.print("Hello, " + name);
         } else {
            response.sendRedirect("index.jsp");
         }
      }
      else{
          request.getRequestDispatcher("index.jsp").include(request, response); 
      }
      
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("<!--      <form action=\"LogoutServlet\" method=\"post\">-->\n");
      out.write("          <a href = \"admin.jsp\">Add Event</a>\n");
      out.write("          <a href=\"LogoutServlet\">Logout</a>\n");
      out.write("      <!--</form>-->\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("  <nav class=\"sidevav\">\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"#slide1\" class=\"category\"><i class=\"fas fa-envelope-open\"></i> Training and Placement Cell</a></li><br>\n");
      out.write("      <li><a href=\"#slide2\" class=\"category\"><i class=\"fab fa-leanpub\"></i> Academia</a></li><br>\n");
      out.write("      <li><a href=\"#slide3\" class=\"category\"><i class=\"fas fa-laptop\"></i> IT Workshops</a></li><br>\n");
      out.write("      <li><a href=\"#slide4\" class=\"category\"><i class=\"fas fa-newspaper\"></i> CIDI Training and Projects</a></li><br>\n");
      out.write("      <li><a href=\"#slide5\" class=\"category\"><i class=\"fas fa-futbol\"></i> Sports</a></li><br>\n");
      out.write("      <li><a href=\"#slide6\" class=\"category\"><i class=\"fas fa-hashtag\"></i> IT clubs</a></li><br>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("  <div id=\"id01\" class=\"modal\">\n");
      out.write("  \n");
      out.write("    <form class=\"modal-content animate\" action=\"admin.jsp\" method=\"post\">\n");
      out.write("      <div class=\"imgcontainer\">\n");
      out.write("        <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("      <div class=\"container\">\n");
      out.write("  \n");
      out.write("        <label for=\"psw\"><b>Password</b></label>\n");
      out.write("        <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("          \n");
      out.write("        <button type=\"submit\" id= \"login\" >Login</button>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("      <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <article>\n");
      out.write("      <div class=\"column\">\n");
      out.write("  <div class=\"row\" >\n");
      out.write("    <div class=\"card\" id=\"slide0\">\n");
      out.write("      <h3>IMPORTANT</h3>\n");
      out.write("      <table>\n");
      out.write("          <tr>\n");
      out.write("              <td>\n");
      out.write("                  <a href=\"#w\" class=\"important\">\n");
      out.write("                    ");

          try{ 
          connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
          statement=connection.createStatement();
          String sql ="SELECT Title FROM post where isImportant = 1";
               resultSet = statement.executeQuery(sql);
          while(resultSet.next()){
          
      out.write("\n");
      out.write("          ");
      out.print(resultSet.getString("title") );
      out.write("\n");
      out.write("          <br>\n");
      out.write("        ");
 
            }
            } catch (Exception e) {
            e.printStackTrace();
            }
        
      out.write("\n");
      out.write("      </a>\n");
      out.write("              </td>\n");
      out.write("          </tr>\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write("  </div><br>\n");
      out.write("      \n");
      out.write("  <!--  <div class=\"column\"> -->\n");
      out.write("  <div class=\"row\" >\n");
      out.write("    <div class=\"card\" id=\"slide1\">\n");
      out.write("      <h3>Training and Placement Cell</h3>\n");
      out.write("    </div>\n");
      out.write("  </div><br>\n");
      out.write("\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"card\" id=\"slide2\">\n");
      out.write("      <p>Academia</p>\n");
      out.write("    </div>\n");
      out.write("  </div><br>\n");
      out.write("  \n");
      out.write("  <div class=\"row\" >\n");
      out.write("    <div class=\"card\" id=\"slide3\">\n");
      out.write("      <p>IT Workshops</p>\n");
      out.write("      <table>\n");
      out.write("          <tr>\n");
      out.write("              <td>\n");
      out.write("                    ");

          try{ 
              String ttl= "Select Title from post where Category = 'Workshops'";
              String desc= "Select Description from post where Title = '"+ttl+"'";
              String sql ="SELECT Title, User_ID, SUBSTR('"+desc+"', 1, 3), Created_On FROM post where Title = '"+ttl+"'";
               resultSet = statement.executeQuery(sql);
          while(resultSet.next()){
          
      out.write("\n");
      out.write("          <a href=\"#w\" class=\"important\">\n");
      out.write("              ");
      out.print(resultSet.getString("title") );
      out.write("</a><br>\n");
      out.write("          ");
      out.print(resultSet.getString("user_ID") );
      out.write("<br>\n");
      out.write("          ");
      out.print(resultSet.getString("Created_On") );
      out.write("<br>\n");
      out.write("          ");
      out.print(resultSet.getString("desc") );
      out.write("\n");
      out.write("          <br><br>\n");
      out.write("        ");
 
            }
            } catch (Exception e) {
            e.printStackTrace();
            }
        
      out.write("\n");
      out.write("      \n");
      out.write("              </td>\n");
      out.write("          </tr>\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write("  </div><br>\n");
      out.write("  \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"card\" id=\"slide4\">\n");
      out.write("      <p>CIDI Training and Projects</p>\n");
      out.write("    </div>\n");
      out.write("  </div><br>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"card\" id=\"slide5\">\n");
      out.write("      <p>Sports</p>\n");
      out.write("    </div>\n");
      out.write("  </div><br>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"card\" id=\"slide6\">\n");
      out.write("      <p>IT clubs</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  </article>\n");
      out.write("</section>\n");
      out.write("<script>\n");
      out.write("  // Get the modal\n");
      out.write("  var modal = document.getElementById('id01');\n");
      out.write("  \n");
      out.write("  // When the user clicks anywhere outside of the modal, close it\n");
      out.write("    window.onclick = function(event) {\n");
      out.write("      if (event.target == modal) {\n");
      out.write("          modal.style.display = \"none\";\n");
      out.write("      }\n");
      out.write("  }\n");
      out.write("  </script>\n");
      out.write("<footer>\n");
      out.write("  <marquee>Trending</marquee>\n");
      out.write("</footer>\n");
      out.write("\n");
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
