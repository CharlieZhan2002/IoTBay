<%--
    Document   : Logout
    Created on : 2022-3-30, 14:44:46
    Author     : 12717
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Logout Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="Logout.css">
</head>
<body>
<!<!-- ../index page/index.jsp -->
<form action="../SaveSuccessServlet" method="post">
    <h1 class="lg_cb_tit">Save Succeeded</h1><br/>
    <div class="lg_cb"><br/><br/><br/><br/>
        <p class="lg_cb_subtit">Thank you for provide your information</p>
        <p class="lg_cb_subtit">Please click the buttom in below to back to main page.</p></br>
        <button class="lg_cb_btn" type="submit" value="post"/>Back to Main</button>
</form>
</div>
</body>
</html>
