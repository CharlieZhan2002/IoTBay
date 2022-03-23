<%-- 
    Document   : Login
    Created on : 2022年3月23日, 下午2:29:09
    Author     : zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <h1 class="lg_tit">Welcome to IoTBay System</h1>
        <br/>
        <div class="lg_cb">
            <p class="lg_cb_tit">Login</p>
            <p class="lg_cb_subtit">Please Enter Your Username and Password</p>
            <form action="../WelcomePage/Welcome.jsp" method="post">
                <p class="lg_cb_iptit">Your Email</p>
                <input class="lg_cb_ip" type="text" placeholder="Email" name="email" required="true">
                <p class="lg_cb_iptit">Your Password</p>
                <input class="lg_cb_ip" type="password" placeholder="Password" name="password" required="true">
                <p class="lg_cb_fp">Forget Password</p>
                <a class="lg_cb_su" href="../RegisterPage/Register.jsp">Sign up</a>
                <br/>
                <input class="lg_cb_btn" type="submit" value="Login"/>
            </form>
            <button class="lg_cb_btn" onclick="window.location.href='../WelcomePage/Welcome.jsp'"/>Anonymous</button>
        </div>
    </body>
</html>
