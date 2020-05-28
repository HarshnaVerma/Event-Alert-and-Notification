<%-- 
    Document   : studentdash
    Created on : 27 Feb, 2020, 6:20:53 PM
    Author     : Hp
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<html lang="en">

<head>
    <title>Dashboard</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://kit.fontawesome.com/90b9ec7b5d.js" crossorigin="anonymous"></script>

    <link rel="stylesheet" href="stylesheet/sstyle.css">
    <style>
         .dropbtn {
            background-color: whitesmoke;
            color: black;
            padding: 11px;
            font-size: 16px;
            border: none;
        }
        
        .dropdown {
            position: absolute;
            display: inline-block;
            right: 10px;
        }
        
        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f1f1f1;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
            z-index: 1;
        }
        
        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }
        
        .dropdown-content a:hover {
            background-color: #ddd;
        }
        
        .dropdown:hover .dropdown-content {
            display: block;
        }
        
        .dropdown:hover .dropbtn {
            background-color: olive;
        }
        body {
            font-family: Arial, Helvetica, sans-serif;
        }
        
        input[type=text],
        input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        
        #login {
            background-color: #7575a3;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }
        
        #login:hover {
            opacity: 0.8;
        }
        
        .container {
            padding: 16px;
        }
        
        span.psw {
            float: right;
            padding-top: 16px;
        }
        
        .modal {
            display: none;
            position: fixed;
            z-index: 1;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            overflow: auto;
            background-color: rgb(0, 0, 0);
            background-color: rgba(0, 0, 0, 0.4);
            padding-top: 60px;
        }
        
        .modal-content {
            background-color: #d9b38c;
            margin: 5% auto 15% auto;
            border: 3px solid black;
            border-radius: 3%;
            width: 50%;
        }
        /* The Close Button (x) */
        
        .close {
            position: absolute;
            right: 25px;
            top: 0;
            color: #000;
            font-size: 35px;
            font-weight: bold;
        }
        
        .close:hover,
        .close:focus {
            color: red;
            cursor: pointer;
        }
        /* Add Zoom Animation */
        
        .animate {
            -webkit-animation: animatezoom 0.6s;
            animation: animatezoom 0.6s
        }
        
        @-webkit-keyframes animatezoom {
            from {
                -webkit-transform: scale(0)
            }
            to {
                -webkit-transform: scale(1)
            }
        }
        
        @keyframes animatezoom {
            from {
                transform: scale(0)
            }
            to {
                transform: scale(1)
            }
        }
        /* Change styles for span and cancel button on extra small screens */
        
        @media screen and (max-width: 300px) {
            span.psw {
                display: block;
                float: none;
                font-family: Arial;
            }
            .cancelbtn {
                width: 100%;
            }
        }
        .table{
            width: 100%;
            width: -moz-available;          /* For Mozzila */
            width: -webkit-fill-available;  /* For Chrome */
            width: stretch; 
        }
        .table td{
            font-size: medium;
            margin: 1%;
            text-align: center;
        }
        
       .thumb1 {
  position: relative;
  width: 100;
}

      .overlay {
  position: absolute;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: #ffffff;
  opacity:0.8;
  overflow: hidden;
  width: 100%;
  height: 0;
  transition: .5s ease;
}

.thumb1:hover .overlay {
  height: 50%;
}
.text2 {
  color: black;
  font-size: 20px;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
  text-align: center;
}
.postLink, .postLink :hover{
    text-decoration: none;
    color: blue;
}    
    </style>
</head>

<body>
    
    <%
String title = request.getParameter("Title");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "project";
String userId = "root";
String password = "root";
String year = null;
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
String curDate= formatter.format(date); 
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>


    <header>
        <img src="img/Logo.png" alt="sgsitslogo" class="img1">
        <h2>Shri G. S. Institute of Technology & Science, Indore</h2>
        <div class="dropdown">
            <button class="dropbtn">
        <% 
      if (session != null) {
         if (session.getAttribute("user") != null) {
            String name = (String) session.getAttribute("user");
            year = (String)session.getAttribute("year");
            out.print("Hello, " + name);
        } else {
            response.sendRedirect("index.jsp");
         }
      }
      else{
          request.getRequestDispatcher("index.jsp").include(request, response); 
      }
      %>&nbsp<img  class="img2" src="stylesheet/icon.jpg" alt="profile"></button>
      <div class="dropdown-content">
                <%
                   String uid = (String) session.getAttribute("uid");
                   if (!uid.contains("0801")){
                       out.println("<a href='admin.jsp' id='ev'>Add Event</a>");
                   }
                %>
                <a href="LogoutServlet">Logout</a>
                
        </div>
        </div>
        <h3>Department of Information Technology</h3>

    </header>

    <section>
        <nav class="sidenav">
            <ul>
                <li><a href="#slide0"><i class="fas fa-star"></i> Important</a></li><br>
                <li><a href="#slide1"><i class="fas fa-envelope-open"></i> Training and Placement Cell</a></li><br>
                <li><a href="#slide2"><i class="fab fa-leanpub"></i> Academia</a></li><br>
                <li><a href="#slide3"><i class="fas fa-laptop"></i> IT Workshops</a></li><br>
                <li><a href="#slide4"><i class="fas fa-newspaper"></i> CIDI Training and Projects</a></li><br>
                <li><a href="#slide5"><i class="fas fa-futbol"></i> Sports</a></li><br>
                <li><a href="#slide6"><i class="fas fa-hashtag"></i> IT clubs</a></li><br>
            </ul>
        </nav>

        <article>
            <div class="column">
                <div class="row">
                    <div class="card" id="slide0">
                        <h2 style="z-index:'-1'">IMPORTANT</h2>
                        
                        <div class="container6" > 
                            <%
                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                      String sql = null;
                      if (!uid.contains("0801")){
                      sql ="SELECT Title, Category FROM post where isImportant = 1 and isDeleted = 0 and Expiry_Date > '"
                              +curDate+"' order by Created_On desc";
                      }
                      else{
                         sql ="SELECT Title, Category FROM post where isImportant = 1 and isDeleted = 0 and Expiry_Date > '"
                                 +curDate+"'and Intended_Audience like '%"+year+"%' order by Created_On desc";
                      }
                      resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      %>
        <div class="table-responsive" >
            
                            
            <ul style="text-align:left"><li><b><a href='#<%=resultSet.getString("Title")%>' class = "postLink" style="text-decoration:none; ">
                                        <%=resultSet.getString("title") %></a></b></li></ul>
            
           
        </div>
            <br>    
                    <% 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    %>
    </div>
 
                    </div>
                </div>
    <br>

                <div class="row">
                    <div class="card" id="slide1">
                        <h2>Training and Placement Cell</h2>
                        <div class="container6">
                         <%
                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                     
                      String sql = null;
                      if (!uid.contains("0801")){
                        sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Training and Placement' and isDeleted = 0 and Expiry_Date > '"+curDate+"' order by Created_On desc";
                      }
                      else{
                          sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Training and Placement' and isDeleted = 0 and Expiry_Date > '"+curDate+"' and Intended_Audience like '%"+year+"%' order by Created_On desc";
                      }
                           resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      %>
                    
                    <div class="table-responsive" style="border: 2px dotted black;
        padding: 15px;
        background: white;
        background-clip: border-box; " >
                    <table class="table" id="<%=resultSet.getString("Title")%>">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Description</th>                       
                        <th>Posted By</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Attachment</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <h3> <a href="postpage.jsp?Title='<%=resultSet.getString("title") %>'" class = "postLink">
                                    <%=resultSet.getString("title") %>
                  </a></h3>
                        </td>
                       <td>
                           
                            <p class="dis1"><%=resultSet.getString("Description") %>...
                                    </p>
                          
                        </td>
                        <td><%=resultSet.getString("User_Name") %></td>
                        <td><%=resultSet.getString("Created_On") %></td>
                        <td><%=resultSet.getString("Expiry_Date") %></td>
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
                </tbody>
            </table>
                        
                    </div><br>
                                         <% 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    %>
                    </div>
                       
                    </div>
                </div><br>

                <div class="row">
                    <div class="card" id="slide2">
                        <h2>Academia</h2>
                        <div class="container6">
                            <%
                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                     
                      String sql = null;
                      if (!uid.contains("0801")){
                        sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Academia' and isDeleted = 0 and Expiry_Date > '"+curDate+"' order by Created_On desc";
                      }
                      else{
                          sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Academia' and isDeleted = 0 and Expiry_Date > '"+curDate+"' and Intended_Audience like '%"+year+"%' order by Created_On desc";
                      }
                           resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      %>
        <div id="Academia" class="table-responsive" style="border: 2px dotted black;
        padding: 15px;
        background: white;
        background-clip: border-box; " >
             <table class="table" id="<%=resultSet.getString("Title")%>">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Description</th>                       
                        <th>Posted By</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Attachment</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <h3> <a href="postpage.jsp?Title='<%=resultSet.getString("title") %>'" class = "postLink">
                                <%=resultSet.getString("title") %></a></h3>
                        </td>
                        
                        <td>
                           
                            <p class="dis1"><%=resultSet.getString("Description") %>...
                                    </p>
                          
                        </td>
                        
                        <td><%=resultSet.getString("User_Name") %></td>
                        <td><%=resultSet.getString("Created_On") %></td>
                        <td><%=resultSet.getString("Expiry_Date") %></td>
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
                </tbody>
                
            </table>
        </div><br>
            <% 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    %>
    </div>
  
                    </div>
                </div><br>

                <div class="row">
                    <div class="card" id="slide3">
                         <h2>IT Workshops</h2>
                        <div class="container6">
                            <%
                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                    
                      String sql = null;
                      if (!uid.contains("0801")){
                        sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Workshops' and isDeleted = 0 and Expiry_Date > '"+curDate+"' order by Created_On desc";
                      }
                      else{
                          sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Workshops' and isDeleted = 0 and Expiry_Date > '"+curDate+"' and Intended_Audience like '%"+year+"%' order by Created_On desc";
                      }
                           resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      %>
        <div id="Workshops" class="table-responsive" style="border: 2px dotted black;
        padding: 15px;
        background: white;
        background-clip: border-box; " >
             <table class="table" id="<%=resultSet.getString("Title")%>">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Description</th>
                        
                        <th>Posted By</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Attachment</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <h3> <a href="postpage.jsp?Title='<%=resultSet.getString("title") %>'" class = "postLink">
                <%=resultSet.getString("title") %>
                      <br>
                   
                  </a></h3>
                        </td>
                         
                        <td>
                           
                            <p class="dis1"><%=resultSet.getString("Description") %>...
                                    </p>
                          
                        </td>
                        
                        <td><%=resultSet.getString("User_Name") %></td>
                        <td><%=resultSet.getString("Created_On") %></td>
                        <td><%=resultSet.getString("Expiry_Date") %></td>
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
                </tbody>
                 
            </table>
        </div><br>
            <% 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    %>
    </div>
                    </div>
                </div><br>

                <div class="row">
                    <div class="card" id="slide4">
                        <h2>CIDI Trainings and Projects</h2>
                        
                        <div class="container6">
                             <%
                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                     
                      String sql = null;
                      if (!uid.contains("0801")){
                        sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Trainings' and isDeleted = 0 and Expiry_Date > '"+curDate+"' order by Created_On desc";
                      }
                      else{
                          sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Trainings' and isDeleted = 0 and Expiry_Date > '"+curDate+"' and Intended_Audience like '%"+year+"%' order by Created_On desc";
                      }
                           resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      %>
        <div id="Trainings" class="table-responsive" style="border: 2px dotted black;
        padding: 15px;
        background: white;
        background-clip: border-box; ">
             <table class="table" id="<%=resultSet.getString("Title")%>">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Description</th>
                        
                        <th>Posted By</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Attachment</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <h3> <a href="postpage.jsp?Title='<%=resultSet.getString("title") %>'" class = "postLink">
                                <%=resultSet.getString("title") %>
                    
                  </a></h3>
                        </td>
                                                
                        <td>
                           
                            <p class="dis1"><%=resultSet.getString("Description") %>...
                                    </p>
                          
                        </td>
                        
                        <td><%=resultSet.getString("User_Name") %></td>
                        <td><%=resultSet.getString("Created_On") %></td>
                        <td><%=resultSet.getString("Expiry_Date") %></td>
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
                </tbody>
                
            </table>
        </div><br>
            <% 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    %>
    </div>

                  
                        
                    </div>
                </div><br>

                <div class="row">
                    <div class="card" id="slide5">
                        <h2>Sports</h2>
                        <div class="container6"><%
                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                      String sql = null;
                      if (!uid.contains("0801")){
                        sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Sports' and isDeleted = 0 and Expiry_Date > '"+curDate+"' order by Created_On desc";
                      }
                      else{
                          sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Sports' and isDeleted = 0 and Expiry_Date > '"+curDate+"' and Intended_Audience like '%"+year+"%' order by Created_On desc";
                      }
                           resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      %>
        <div id="Sports" class="table-responsive" style="border: 2px dotted black;
        padding: 15px;
        background: white;
        background-clip: border-box; " >
             <table class="table" id="<%=resultSet.getString("Title")%>">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Description</th>
                       
                        <th>Posted By</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Attachment</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <h3> <a href="postpage.jsp?Title='<%=resultSet.getString("title") %>'" class = "postLink">
                               
                      <%=resultSet.getString("title") %>
                      <br>
                   
                  </a></h3>
                        </td>
                        
                        <td>
                           
                            <p class="dis1"><%=resultSet.getString("Description") %>...
                                    </p>
                          
                        </td>
                        
                        <td><%=resultSet.getString("User_Name") %></td>
                        <td><%=resultSet.getString("Created_On") %></td>
                        <td><%=resultSet.getString("Expiry_Date") %></td>
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
                </tbody>
                 
            </table>
        </div><br>
        <% 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    %>
    </div>

                        
                    </div>
                </div><br>

                <div class="row">
                    <div class="card" id="slide6">
                       <h2>IT Clubs</h2> 
                        <div class="container6">
                            <%
                      try{ 
                      connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                      statement=connection.createStatement();
                      String sql = null;
                      if (!uid.contains("0801")){
                        sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Official Clubs' and isDeleted = 0 and Expiry_Date > '"+curDate+"' order by Created_On desc";
                      }
                      else{
                          sql ="SELECT Title,User_Name,left(Description, 50) as Description,Created_On,Expiry_Date, Filename FROM post inner join user on post.User_ID = user.User_ID where Category='Official Clubs' and isDeleted = 0 and Expiry_Date > '"+curDate+"' and Intended_Audience like '%"+year+"%' order by Created_On desc";
                      }
                           resultSet = statement.executeQuery(sql);
                      while(resultSet.next()){
                      %>
        <div id="Official Clubs" class="table-responsive" style="border: 2px dotted black;
        padding: 15px;
        background: white;
        background-clip: border-box; " >
             <table class="table" id="<%=resultSet.getString("Title")%>">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Description</th>
                        <th>Posted By</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Attachment</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <h3> <a href="postpage.jsp?Title='<%=resultSet.getString("title") %>'" class = "postLink">
                                
                      <%=resultSet.getString("title") %>
                      <br>
                    
                  </a></h3>
                        </td>
                         
                        <td>
                           
                            <p class="dis1"><%=resultSet.getString("Description") %>...
                                    </p>
                          
                        </td>
                        
                        <td><%=resultSet.getString("User_Name") %></td>
                        <td><%=resultSet.getString("Created_On") %></td>
                        <td><%=resultSet.getString("Expiry_Date") %></td>
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
                </tbody>
                
            </table>
        </div><br>
        <% 
                        }
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    %>
    </div>

                        
                    </div>          
                    </div>
                </div>
       
        </article>
    </section>
    <script>
        // Get the modal
        var modal = document.getElementById('id01');
        //var addEvent = document.getElementById('ev');

        // When the user clicks anywhere outside of the modal, close it
        window.onclick = function(event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
        }
        
    </script>
    <footer>
        Copyright @ SGSITS IT, 2020
    </footer>

</body>

</html>
