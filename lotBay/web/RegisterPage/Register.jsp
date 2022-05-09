<%-- 
    Document   : Register
    Created on : 2022年3月23日, 下午5:35:07
    Author     : yunwei zhang
--%>
<%@page import = "uts.isd.mdoel.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="Register.css">
        <title>Register Page</title>
    </head>
    <%
        String existErr = (String) session.getAttribute("existErr");
        String nameErr = (String) session.getAttribute("nameErr");
        String emailErr = (String) session.getAttribute("emailErr");
        String passErr = (String) session.getAttribute("passErr");
        String phoneErr = (String) session.getAttribute("phoneErr");
    %>
    <body>
        <h1 class="r_tit">Welcome to IoTBay System</h1>
        <br/>
        <div class="r_cb">
               
            <p class="r_cb_tit">Register</p>
            <p class="r_cb_subtit">Please Enter Your Details To Sign Up</p>
            <form action = CustRegisterServlet method = "post">
                <p class="r_cb_iptit">Your Email</p>
                <input class="r_cb_ip" type="text" placeholder="Email" name="email" required="true">
                <p class="r_cb_iptit">Your Full Name</p>
                <input class="r_cb_ip" type="text" placeholder="Full Name" name="fullname" required="true">
                <p class="r_cb_iptit">Your Password</p>
                <input class="r_cb_ip" type="password" placeholder="Password" name="password" required="true">
                <p class="r_cb_iptit">Your Phone Number</p>
                    <input class="r_cb_ip" type="text" placeholder = "Phone Number"name="phone" required="true">
                <input class="r_cb_btn" type="submit" value="Register"/>
                <a class="r_cb_bk" href="../LoginPage/Login.jsp">Back to Login</a>
            </form>
            <p><%= existErr != null? existErr : ""%></p>
        </div>
    </body>
</html>
