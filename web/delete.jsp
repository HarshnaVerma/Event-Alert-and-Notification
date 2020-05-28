<%-- 
    Document   : update
    Created on : 24 Mar, 2020, 1:58:06 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<html>
    <body>
<font color="blue">Please Enter Post ID </font><br><br>
<form method="post" action="delete.jsp">
<table border = "0">
  <tr align="left" valign="top">
  <td>Post ID:</td>
  <td><input type="text" name ="id" /></td>
  </tr>
  <tr align="left" valign="top">
  <td></td>
  <td><input type="submit" name="delete" value="Delete"/></td>
  </tr>
</table>
</form>

<%
String id = request.getParameter("id");
    out.print(id);
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
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement = connection.createStatement();
String sql ="update post set isDeleted=1 where Post_Id="+id;
resultSet = statement.executeQuery(sql);
    out.print(id);
while(resultSet.next()){
        out.println("<p>Are you sure?</p>");
        out.println("<button type='submit' value='Yes' onclick='deleteRecord()'></button>");
        out.println("<button type='submit' value='No' onclick=window.location='admin.jsp'></button>");
        
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>