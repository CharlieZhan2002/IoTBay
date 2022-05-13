<%-- 
    Document   : StaffSave
    Created on : May 13, 2022, 1:38:45 AM
    Author     : ettas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <title>Save page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="CustomerView.css">
    </head>
    <body>
        <h1 class="cv_cb_tit">Details Updated</h1><br/>
    <div class="sv_cb"><br/><br/><br/><br/>
        <p class="sv_cb_subtit">Your details have been updated.</p>
        <p class="sv_cb_subtit">Click the button below to return to your profile.</p>
        </br>
         <form method="POST" action="/lotBay/StaffPages/StaffView.jsp">  
                <input class="sv_cb_btn" type="submit" value="My profile"/>  
        </form> 

    </body>
</html>
