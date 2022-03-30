<%-- 
    Document   : index2
    Created on : 30/03/2022, 12:22:53 PM
    Author     : K
--%>

<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
         <link type="text/css" rel="stylesheet" href="index.css">
    </head>
    <body>
        <h1 class="lg_tit">Welcome to IoTBay System</h1>
         <br/>
        <div class="lg_cb">
            <p class="lg_cb_tit">Index Page</p>
            <p class="lg_cb_subtit"> Dear Customer, you can choose register, login or anonymous button below</p>
            <p class="lg_cb_subtit"> Have a Good Day!</p>
            <form>
            <button class="lg_cb_btn" onclick="window.location.href='Register.jsp'"/>Register</button>
        </form>
        <button class="lg_cb_btn" onclick="window.location.href='Login.jsp'"/>Login</button>
        <form>
        <button class="lg_cb_btn" onclick="window.location.href='Welcome.jsp'"/>Anonymous user</button>
        </form>
        </div>
       