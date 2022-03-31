<%-- 
    Document   : Main
    Created on : 2022-3-30, 14:24:27
    Author     : 12717
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Java.CustomerBean"%>
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
        <h1 class = "m_cb_tit">Welcome to Main page</h1></br>
         <div class = "m_cb"></h1></br></br></br>
         <%
            CustomerBean customer = (CustomerBean)session.getAttribute("customer");
        %>
         <br/>
         <h1 class = "m_cb_subtit">Welcome, ${customer.fullName}</h1>
         <p class = "m_cb_subtit"> You have logged in with email: ${customer.email}</P>
         <p class = "m_cb_subtit"> Your date of birth is ${customer.dateOfBirth}</p>
         <br/>
         <a class="m_cb_bk" href="../LogoutPage/Logout.jsp">Logout</a>
         </<div>
    </body>
</html>
