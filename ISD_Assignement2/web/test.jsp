<%-- 
    Document   : test
    Created on : 2022-5-1, 23:58:21
    Author     : huasongwen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=request.getAttribute("login_email")%></h1>
    </body>
</html>
