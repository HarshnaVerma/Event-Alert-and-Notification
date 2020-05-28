<%-- 
    Document   : postpage
    Created on : 11 Apr, 2020, 5:15:59 PM
    Author     : HP
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Event Page</title>
<style>
* {
            box-sizing: border-box;
        }
        /* Add a gray background color with some padding */
        
        body {
            font-family: Arial;
            margin: 0;
            padding: 0px;
            width: 100%;
            background-image: url('img/loginbg2.jpg');
            background-size: cover;
        }
        /* Header/Blog Title */
        
        header {
            height: 100px;
            width: 100%;
            background-color: whitesmoke;
        }
        
        .logo {
            float: left;
            height: 80px;
            width: 80px;
            margin: 10px 10px;
            border: 2px solid goldenrod;
            border-radius: 50%;
        }
        
        header h2,
        h3 {
            text-align: center;
            font-family: "Palatino Linotype", "Book Antiqua", Palatino, serif;
            /*font-size: 40px;*/
            letter-spacing: 0px;
            word-spacing: 1.4px;
            /*color: white;*/
            color: black;
            /* font-weight: 300; */
            text-decoration: none solid rgb(68, 68, 68);
            margin-bottom: auto;
        }
        /* Create two unequal columns that floats next to each other */
        /* Left column */
        
        .leftcolumn {
            padding: 10px;
            float: left;
            width: 75%;
        }
        /* Right column */
        
        .rightcolumn {
            padding: 10px;
            float: left;
            width: 25%;
            padding-left: 20px;
            text-align: center;
        }
        /* Fake image */
        
        .fakeimg img {
            display: block;
            margin-left: auto;
            margin-right: auto;
            border: 2px solid black;
            border-radius: 4px;
            padding: 5px;
            width: 150px;
        }
        .fakeimgII img {
            display: block;
            margin-left: auto;
            margin-right: auto;
            border: 2px solid black;
            border-radius: 4px;
            padding: 5px;
            width: 150px;
        }
        /* Add a card effect for articles */
        
        .cardI {
            border: 4px solid black;
            border-radius: 4px;
            background-color: white;
            padding: 20px;
            margin-top: 20px;
        }
        .cardII {
            border: 4px solid black;
            border-radius: 4px;
            background-color: #00CED1;
            color:white;
            opacity:0.9;
            padding: 20px;
            margin-top: 20px;
        }
        /* Clear floats after the columns */
        
        .row:after {
            content: "";
            display: table;
            clear: both;
        }
        /* Footer */
        
        .footer {
            padding: 20px;
            text-align: center;
            background: #ddd;
            margin-top: 20px;
        }
        /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other */
        
        @media screen and (max-width: 800px) {
            header {
                height: auto;
            }
            .leftcolumn,
            .rightcolumn {
                width: 100%;
            }
        }
        
        .glow {
  font-size: 20px;
  color: #fff;
  text-align: center;
  -webkit-animation: glow 1s ease-in-out infinite alternate;
  -moz-animation: glow 1s ease-in-out infinite alternate;
  animation: glow 1s ease-in-out infinite alternate;
}

@-webkit-keyframes glow {
  from {
    text-shadow: 0 0 10px #fff, 0 0 20px #fff, 0 0 30px #e60073, 0 0 40px #e60073, 0 0 50px #e60073, 0 0 60px #e60073, 0 0 70px #e60073;
  }
  
  to {
    text-shadow: 0 0 20px #fff, 0 0 30px #ff4da6, 0 0 40px #ff4da6, 0 0 50px #ff4da6, 0 0 60px #ff4da6, 0 0 70px #ff4da6, 0 0 80px #ff4da6;
  }
}
        
</style>
</head>
<body>
    <%
String title = request.getParameter("Title");
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
String sql ="select * from post where Title="+title;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<header>
        <img src="img/Logo.png" alt="sgsitslogo" class="logo">
        <h2>Shri G. S. Institute of Technology & Science, Indore</h2>
        <h3>Department of Information Technology</h3>

    </header>

<div class="row">
  <div class="leftcolumn">
    <div class="cardI">
        <h2><%=resultSet.getString("Title") %></h2>
      <h5><b>Created_On : </b><%=resultSet.getString("Created_On") %></h5>
      
      <% if (resultSet.getString("Filename")==null){
                                out.print("No Attachment");
                            }
                            else{
                            %>
      <% if (resultSet.getString("Filename").contains(".jpg") || 
                  resultSet.getString("Filename").contains(".jpeg") || 
                  resultSet.getString("Filename").contains(".png"))
          { %>
      <div class="fakeimg" style="height:50%; text-align: center">
          <img src="uploadedFiles/<%=resultSet.getString("Filename") %>" style="width: 60%;height:100%;">
          <br><br>
          <a target="_blank" href="uploadedFiles/<%=resultSet.getString("Filename")%>" download="download" >                                    
                                    <%=resultSet.getString("Filename")%>                                
                                </a>
          </div>
                                <% }else{ %>
          <a target="_blank" href="uploadedFiles/<%=resultSet.getString("Filename")%>" download="download">                                    
                                    <%=resultSet.getString("Filename")%>                                
                                </a><% } %>
                                
       <% } %>                         
      <h5><b>Expiry_Date : </b> <%=resultSet.getString("Expiry_Date") %></h5>
      <p><%=resultSet.getString("Description") %> </p>
    </div>
   <%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
  </div>
  <div class="rightcolumn">
    <div class="cardII" style="height:437px;">
        <h2>Information Technology</h2>
      <div class="fakeimgII"><img src="img/IT.jpg" alt="Information Technology" style="width: 80%;height:100%; " /></div>
      <marquee><div><p class="glow"><b>“Engineers like to solve problems.<br>
                      If there are no problems handily available,<br>
                      they will create their own problems."<br>
                - Scott Adams </b> </p><div></marquee>
    </div>
  </div>
</div>

<div class="footer">
  <center> Copyright @ SGSITS IT, 2020</center> 
</div>

</body>
</html>
