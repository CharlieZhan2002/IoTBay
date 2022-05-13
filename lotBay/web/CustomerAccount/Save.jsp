<%-- 
    Document   : Save
    Created on : May 13, 2022, 12:06:24 AM
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
<!<!-- ../index page/index.jsp -->
     <form method="POST" action="../MainServlet">  
    <h1 class="cv_cb_tit">Details Updated</h1><br/>
    <div class="sv_cb"><br/><br/><br/><br/>
        <p class="sv_cb_subtit">Your details have been updated.</p>
        <p class="sv_cb_subtit">Click the button below to return to your profile.</p>
        </br>
         
                <input class="sv_cb_btn" type="submit" value="My profile"/>  
     </form> 

</div>
</body>
</html>
