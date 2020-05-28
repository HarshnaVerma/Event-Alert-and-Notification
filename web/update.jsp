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

<%
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
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement = connection.createStatement();
String sql ="select * from post where Post_Id="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.ckeditor.com/4.13.1/standard/ckeditor.js"></script>
        <title>update</title>
        <link rel="stylesheet" href="stylesheet/updatestyle.css" >
    </head>
    <body>
        <header>
        <img src="stylesheet/Logo.png" alt="sgsitslogo" class="logo">
        <h2>Shri G. S. Institute of Technology & Science, Indore</h2>
        <h3>Department of Information Technology</h3>

    </header>
        <div class="header-head">
       <h1>Update Event</h1>
        </div>
        <div id="wrapper"></div>
        <div class="main">
            <form method="post" action="UpdateServlet" enctype='multipart/form-data'>
              
<table>
    <tr>
        <td>Post ID:</td>
        <td><input type="text" name="id" value="<%=resultSet.getString("Post_Id") %>" readonly></td>
    </tr>

<tr>
    <td>Post By:</td>
    <td><input type="text" name="User_Id" value="<%=resultSet.getString("User_Id") %>" readonly></td>
</tr>
<tr><td>
        Title:</td>
    <td><input type="text" name="title" value="<%=resultSet.getString("Title") %>"></td>
</tr>
<tr><td>
        Category:</td>
    <td><input type="text" name="category" value="<%=resultSet.getString("Category") %>"></td>
</tr>
<tr><td>
        Intended_Audience:</td>
    <td><input type="text" name="intended" value="<%=resultSet.getString("Intended_Audience") %>"></td>
<tr>
<tr>
</div>
<!--<div class="main-block">-->
    <td colspan='2'>Description:</td></tr>
  
<tr>
    <td colspan="2">
         <textarea name="textarea1" id="oldDesc" style="visibility: hidden"><%=resultSet.getString("Description") %></textarea>
    </td></tr>
<tr>
    <td colspan="2">
        <!--<textarea id="desc" name="textarea1" rows="15" cols="100" placeholder="Add your content here..." style="visibility: hidden">-->
                <!--</textarea>-->
        <script type="text/javascript"> 
            var desc = document.getElementById('oldDesc').value;
            document.getElementByClassName('cke_editable cke_editable_themed cke_contents_ltr cke_show_borders').innerHTML = desc;
             </script>
        <script>
            CKEDITOR.replace('textarea1');
        </script>
      </td>
</tr>

<tr>
    <td> Old Attachment:</td>
    <td>
                            <% if (resultSet.getString("Filename")==null){
                                out.print("No Attachment");
                            }
                            else{
                            %>
                            <div class="thumb1">
                                <a target="_blank" href="uploadedFiles/<%=resultSet.getString("Filename")%>" download="download">                                    
                                    <%=resultSet.getString("Filename")%>                                
                                </a>
                            </div>
                                <% } %>
                        </td>
</tr>
<tr>
<td>Change Attachment:</td>
    <td><input type="file" name="file" ></td>
</tr>
<tr>
<!--</div>
<div class='main-info'>-->
    <td>Created_On:</td>>
    <td><input type="date" name="createdon" value="<%=resultSet.getString("Created_On") %>" readonly></td>
</tr>
<tr><td>
        Expiry_Date:</td>>
    <td><input type="date" name="expireon" value="<%=resultSet.getString("Expiry_Date") %>"></td>
</tr>
<tr><td>
isImportant:</td>
    <td><input type="number" placeholder="0 or 1 " name="isImp" value="<%=resultSet.getString("isImportant") %>"></td>
 </tr>
</table>
<div class="button">

    <!--<td colspan='2'--><input type="submit" value="UPDATE">
</div>
<!--/tr-->
</form>
        </div>
    
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
<footer>
    
    copyright @ SGSITS IT, Indore 2020
    

</footer>
</body>

</html>