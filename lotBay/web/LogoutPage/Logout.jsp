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
        <form action="../LogoutServlet.jsp" method="post">
        <h1 class="lg_cb_tit">Logout successful</h1><br/><br/>
        <div class="lg_cb"><br/><br/><br/><br/>
        <p class="lg_cb_subtit">Thank you for using IoTBay</p>
        <p class="lg_cb_subtit">Click the button below to return to index</p>
        </br>
          <button class="lg_cb_btn" type="submit" value="post"/>Index</button>
        </form>
        </div>
    </body>
</html>
