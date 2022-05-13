<%-- 
    Document   : AdminEdit
    Created on : 2022年5月5日,
    Author     : songwen hua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="AdminEdit.css">
    <title>Customer Information Management</title>
</head>
<body>

<h1 class="lg_tit">Welcome to Personal Information</h1>
<br/>
<div class="lg_cb">
    <p class="lg_cb_tit">Dear ${name}</p>
    <p class="lg_cb_subtit">You can update information.</p>
    <%--../WelcomePage/Welcome.jsp--%>
    <form action="../AdminEditServlet" method="post">
        <p class="lg_cb_iptit">Email</p>
        <input class="lg_cb_ip" type="text" placeholder="${search_email}" name="email" required="true" readonly="readonly">

        <p class="lg_cb_iptit">Real Full Name</p>
        <input class="lg_cb_ip" type="text" placeholder="${search_fullName}" name="name" required="true">

        <p class="lg_cb_iptit">Password</p>
        <input class="lg_cb_ip" type="text" placeholder="${search_userPassword}"name="password" required="true">

        <p class="lg_cb_iptit">Date of Birthday</p>
        <input class="lg_cb_ip" type="text" placeholder="${search_dateOfBirth}"name="dob" required="true">
        
        <p class="lg_cb_iptit">Gender</p>
        <select class="lg_cb_ip" name="gender">
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="lgbt">LGBT</option>
            <option value="others">Others</option>
        </select>

        <p class="lg_cb_iptit">Address</p>

        <input class="lg_cb_ip" type="text" placeholder="${search_address == null? 'Null': search_address}"name="address" required="false">


        <br/>
        <br/>
        <a class="lg_cb_su" href="CustomerInfo.jsp">Cancel</a>
        <br/>

        <input class="lg_cb_btn" type="submit" value="Save"/>

    </form>
</div>
</body>
</html>
