<%-- 
    Document   : RegistrationError
    Created on : May 7, 2022, 11:48:52 PM
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
        <link rel="stylesheet" href="Register.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 <h1 class="r_tit">Welcome to IoTBay System</h1>
        <br/>
        <div class ="r_cb">
            <p class="r_cb_tit">Registration Error</p> 
            <p class="r_cb_er"> Please enter valid inputs in all fields </p>
            <button class="r_cb_btn" onclick="location.href ='Register.jsp'">Back</button>
        </div>
    </body>
</html>
