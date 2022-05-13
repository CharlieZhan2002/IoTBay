<%-- 
    Document   : Register
    Created on : 2022年3月23日, 下午5:35:07
    Author     : yunwei zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="CustomerAdd.css">
    <title>Register Page</title>
</head>
<body>
<h1 class="r_tit">Customer Information System</h1>
<br/>
<div class="r_cb">
    <p class="r_cb_tit">Customer Addition</p>
    <p class="r_cb_subtit">Please Enter Customer Details To Sign Up</p>
    <form action="../AdminRegisterServlet" method="post">
        <p class="r_cb_iptit">Customer Email</p>
        <input class="r_cb_ip" type="text" placeholder="Email" name="email" required="true">
        <p class="r_cb_iptit">Customer Full Name</p>
        <input class="r_cb_ip" type="text" placeholder="Full Name" name="fullname" required="true">
        <p class="r_cb_iptit">Customer Password</p>
        <input class="r_cb_ip" type="text" placeholder="Password" name="password" required="true">
        <p class="r_cb_iptit">Customer Date Of Birth</p>
        <input class="r_cb_ip" type="date" name="dateofbirth" required="true">
        <p class="lg_cb_iptit">Gender</p>
        <select class="lg_cb_ip" name="gender">
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="lgbt">LGBT</option>
            <option value="others">Others</option>
        </select>

        <p class="lg_cb_iptit">Address</p>

        <input class="lg_cb_ip" type="text" placeholder="Enter Address"name="address" required="false">
        <input class="r_cb_btn" type="submit" value="Register"/>
        <a class="r_cb_bk" href="CustomerInfo.jsp">Back</a>
    </form>
</div>
</body>
</html>
