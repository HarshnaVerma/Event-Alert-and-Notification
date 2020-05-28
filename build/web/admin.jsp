<%-- 
    Document   : admin
    Created on : 12 Mar, 2020, 8:24:30 PM
    Author     : HP
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://cdn.ckeditor.com/4.13.1/standard/ckeditor.js"></script>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Admin</title>
        <link rel="stylesheet" href="stylesheet/astyle.css" >   
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
        
    </head>
    
    <style>

            .table1 {
            width: 100%;
            border-collapse: collapse;
        }
        
        .tr1:nth-of-type(odd) {
            background: #eee;
        }
        
        .th1 {
            background: #333;
            color: white;
            font-weight: bold;
        }
        
        .td1,
        .th1 {
            padding: 6px;
            border: 1px solid #ccc;
            text-align: left;
        }
        /*username dropdown*/
        .dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
/*  min-width: 160px;*/
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
/*  padding: 12px 16px;*/
  z-index: 1;
}

.dropdown:hover .dropdown-content {
  display: block;
}
/*update and delete*/
.updatelink{
    text-decoration: none;
    color: blue;
}
.updatelink :hover{
    text-decoration: none;
    color: blue;
}
.delButton{
    color: blue;
}

</style>
<body>
   <%
String title = request.getParameter("Title");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "project";
String userId = "root";
String password = "root";
String uid = null;

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
    
    <header>
        <nav class="navigation-bar1">
            <img class="logo" src="stylesheet/Logo.png">
<!--            <h2 style="color: black; ">Shri G. S. Institute of Technology and Science, Indore</h2>-->
<button class = "session"><div class="dropdown">
                <span><i class="fa fa-fw fa-user"></i> 
                              <% 
                    if (session != null) {
                       if (session.getAttribute("user") != null) {
                          String name = (String) session.getAttribute("user");
                          uid = (String) session.getAttribute("uid");
                          out.print(name);
                      } else {
                          response.sendRedirect("index.jsp");
                       }
                    }
                    else{
                        request.getRequestDispatcher("index.jsp").include(request, response); 
                    }
                    %></span>
                    <div class="dropdown-content">
                        <a href="LogoutServlet">Logout</a>
                </div>
    </div></button>
            <a href="#post"><i class="fa fa-file"></i> View Events</a>
            <a href="studentdash.jsp"><i class="fa fa-university"></i> Dashboard</a>
            
        </nav>    
    </header>
    <div class="main">  
        <div class="container1" id="id0a">
            <form method="post" id="form1" action="UploadServlet" enctype="multipart/form-data">
                <table class="table" style="margin:auto;">
                    <th colspan="2"><b>ADD EVENT</b></th>
                    <tr>
                        <td style="text-align:left">Add Title : </b><input name="title" type="text" placeholder="title"></td>
                        <td style="text-align:right">
                            <label for="category">Category :</label>
                            <select id="category" name="category">
                                
                                <option value="Official Clubs">Official Clubs</option>
                                <option value="Workshops">Workshops</option>
                                <option value="Trainings">CIDI Trainings and Projects</option>
                                <option value="Academia">Academia</option>
                                <option value="Sports">Sports</option>
                                <option value="Training and Placements">Training & Placements</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <textarea name="textarea1" rows="15" cols="100" placeholder="Add your content here...">
                    </textarea>
                            <script>
                                CKEDITOR.replace('textarea1');
                            </script>
                        </td>
                    </tr>
                    <tr>

                        <td style="text-align:left">
                            Intended Audience :<br>
   
                            <input type="checkbox" id = "audience" name="intended" value="First">
                            <label for="firstyear">Ist Year </label>
                            <input type="checkbox" id = "audience" name="intended" value="Second">
                            <label for="secondyear">II Year</label>
                            <input type="checkbox" id = "audience" name="intended" value="Third">
                            <label for="thirdyear">III Year</label>
                            <input type="checkbox" id = "audience" name="intended" value="Fourth">
                            <label for="fourthyear">IV Year</label><br>
                        </td>
                        <td style="text-align:right">
                            Is Important: <br>
                            <input type="radio" id="yes" name="isImp" value="1">
                            <label for="yes">Yes</label>
                            <input type="radio" id="no" name="isImp" value="0">
                            <label for="no">No</label>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align:left">
                            <label for="createdon">Date of Creation:</label>
                            <input type="date" id="createdon" name="createdon">
                        </td>
                        <td style="text-align:right">
                            <label for="expireon">Expiry Date:</label>
                            <input type="date" id="expireon" name="expireon">
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: left">Attachments : <input type="file" id="myFile" name="filename"></td>
                        
                    </tr>
                    <tr>
                        <td style="text-align: center" colspan="2"><button class="postbutton" onclick="UploadServlet"><b>POST</b> </button></td>
                    </tr>
                </table>   
            </form>
            
            </div>
      </div>  

<div style="margin:15%" class="container11" id="post">
    <center><h2>Events</h2></center>
    <hr>
    <table class="table1">
        <thead>
            <tr class="tr1">
                <th class="th1">ID</th>
                <th class="th1">Title</th>
                <th class="th1">From</th>
                <th class="th1">To</th>
                <th class="th1">Action</th>
            </tr>
        </thead>
        <tbody>
            <%
                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                      String sql ="SELECT * FROM post where isDeleted=0 and User_ID = '"+ uid +"' order by Created_on desc";
                           resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      %>
            <tr class="tr1">
                <td name='id'><%=resultSet.getString("Post_Id") %></td>
                <td class="td1"><b>
                        <%=resultSet.getString("Title") %> </b>    
                            <br>
                                
                </td>
                <td class="td1"><%=resultSet.getString("Created_On") %></td>
                <td class="td1"><%=resultSet.getString("Expiry_Date") %></td>
               
                <td class="td1"><button><a class="updatelink" onclick="updateRecord(<%=resultSet.getString("Post_ID")%>);">Update</a></button>

                    <button class="delButton" onclick="deleteRecord(<%=resultSet.getString("Post_ID")%>);"><a style='text-decoration:none'>Delete</a></button></td>
            </tr>
            <tr>
                <td class="td1"> </td>
                <td class="td1"> </td>
                <td class="td1"> </td>
                <td class="td1">  </td>
                <td class="td1"> </td>
            </tr>
             <% 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    %>
        </tbody>
    </table>

    </div>  
        <script language="javascript">
function deleteRecord(id){
    var doIt=confirm('Are you sure you want to delete this event?\nClick OK to confirm.');
  if(doIt){
   location.href='DeleteServlet?id='+id;

    }
  else{
      location.href='admin.jsp'
    }
}
function updateRecord(id){
    var doIt=confirm('Are you sure you want to Update this event?\nClick OK to confirm.');
  if(doIt){
   location.href='update.jsp?id='+id;

    }
  else{
      location.href='admin.jsp'
    }
}
</script>
<footer>
    <center> Copyright @ SGSITS IT, 2020</center> 
</footer>
</body>
</html>

