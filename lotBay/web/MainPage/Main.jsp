<%-- 
    Document   : Main
    Created on : 2022-3-30, 14:24:27
    Author     : 12717
--%>

<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
         <link type="text/css" rel="stylesheet" href="Main.css">
    </head>
    <body>
        <h1 class = "m_cb_tit">Welcome to Main page</h1></br></br>
         <div class = "m_cb"></h1></br></br></br>
         <%
            User user = (User)session.getAttribute("user");
            String username = user.getUsername();
            String useremail = user.getUseremail();
            String userdob = user.getUserdob();
         %>
         <br/>
         <h1 class = "m_cb_subtit">Welcome, <b><%= (username != null) ? username: "Unknown User Name"%></b></h1>
         <p class = "m_cb_subtit"> You have logged in with email:<b><%= (useremail != null) ? useremail: "Unknown User Email"%></b></P>
         <p class = "m_cb_subtit"> Your date of birth is <b><%= (userdob != null) ? userdob: "Unknown User Date of Birth"%></b></p>
         <br/>
         <a class="m_cb_bk" href="../LogoutPage/Logout.jsp">Logout</a>
         </<div>
    </body>
</html>
