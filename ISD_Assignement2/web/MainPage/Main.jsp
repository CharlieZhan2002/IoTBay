<%-- 
    Document   : Main
    Created on : 2022-3-30, 14:24:27
    Author     : 12717
--%>

<%@page import="uts.isd.model.User" %>
<%@ page import="uts.isd.model.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
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
<%
    // Student student = (Student) session.getAttribute("student");
%>
<h1 class="m_cb_tit">Welcome to Main page</h1></br>
<div class="m_cb"></h1></br></br></br>
    <%
        //  User user = (User) session.getAttribute("user");
    %>
    <br/>
    <h1 class="m_cb_subtit">Welcome, ${name}</h1>
    <p class="m_cb_subtit"> You have logged in with email: ${email}</P>
    <p class="m_cb_subtit"> Your date of birth is ${dob}</p>
    <br/>
    
    <a class="m_cb_bk" href="../LogoutPage/Logout.jsp">Logout</a>

</div>


</body>
</html>

