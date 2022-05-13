<%--
    Document   : Login
    Created on : 2022年3月23日, 下午2:29:09
    Author     : yunwei zhang, etta wu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="Login.css">
    <title>Login Page</title>
</head>
<body>

<h1 class="lg_tit">IoTBay System Admin</h1>
<br/>
<div class="lg_cb">
    <p class="lg_cb_tit">Admin Log-in</p>
    <p class="lg_cb_subtit">Please Enter Your Admin Name and Password</p>
    <%--../WelcomePage/Welcome.jsp--%>
    <form action="../AdminServlet" method="post">
        <p class="lg_cb_iptit">Your Admin Email</p>
        <input class="lg_cb_ip" type="text" placeholder="Admin email" name="adminEmail" required="true">
        <p class="lg_cb_iptit">Your Password</p>
        <input class="lg_cb_ip" type="password" placeholder="Admin password"name="adminPassword" required="true">

        </br></br>

        <a class="lg_cb_su">Contact Us</a>
        </br></br>

        <a class="lg_cb_fp" href="../LoginPage/Login.jsp">Back to Customer Login</a>
        <br/>

        <input class="lg_cb_btn" type="submit" value="LOGIN"/>
    </form>
</div>
</body>
</html>
