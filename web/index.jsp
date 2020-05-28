<%-- 
    Document   : index
    Created on : 27 Feb, 2020, 6:18:19 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    <title>Event Alerts and Notifications </title>
    <link rel="stylesheet" type="text/css" href="stylesheet/style.css">

</head>
<body>
    <header>
        <nav class="header">
            <img class="logo" src="stylesheet/Logo.png">
            <h2>Shri G. S. Institute of Technology & Science, Indore</h2>
            <h4>Department of Information Technology</h4>
            
            <div class="bottomheader">
                <marquee>Welcome to Event Alerts And Notification</marquee>
            </div>
        </nav>
        
    </header>
    <div id="wrapper"></div>
    <div id="loginform">

        <form name="loginform"  onsubmit="return validateForm()" method="post">
            <table class="table">
                <th style="text-align: center; font-size: x-large; padding: 10px;" colspan="2"><b>PLEASE LOGIN</b></th>
                <tr><td colspan="2" align="center"><img src="stylesheet/icon.jpg" class="icon"</td></tr>
                <tr><td>Username : </td><td><input type="text" placeholder="Enter Username" id="name" name="username" required></td></tr>
                <tr><td>Password : </td><td><input type="password" placeholder="Enter Password" id="psw" onblur="test_strr()" name="psw" required></td></tr>

                <tr>
                    <td align="center"><button type="submit" class="loginbutton" onclick="return OnButton1();">Login as Student</button></td>
                    <td align="center"><button type="submit" class="loginbutton" onclick="return OnButton2();">Login as Faculty </button></td>
                </tr>
            </table>

        </form>

    </div>
    
    </div>
    <script type="text/javascript">

        function test_strr() {
            var res;
            var str = document.getElementById("psw").value;
        }
        
function OnButton1()
{
    document.loginform.action = "StudentServlet"
    //document.loginform.target = "_blank";    // Open in a new window
    document.loginform.submit();             // Submit the page
    return true;
}

function OnButton2()
{
    document.loginform.action = "FacultyServlet"
   // document.loginform.target = "_blank";    // Open in a new window
    document.loginform.submit();             // Submit the page
    return true;
}
    </script>
</body>
<footer>
    <div class="footer">
    Copyright @ SGSITS IT, Indore 2020
    </div>

</footer>
</html>