<%-- 
    Document   : Login Error
    Created on : May 8, 2022, 12:19:15 AM
    Author     : ettas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.isd.model.*"%>
<%@page import="uts.isd.model.dao.*"%>
<%@page import="uts.isd.controller.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="Login.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="lg_tit">Welcome to IoTBay System</h1>
        <div class="lg_cb">
            <p class="lg_cb_tit"> Log-in Error </p>
            <p class="lg_cb_er"> Incorrect Log-in details, please try again </p>
             <button class="lg_cb_btn" onclick="location.href ='Login.jsp'">Back</button>
        </div>
    </body>
</html>
