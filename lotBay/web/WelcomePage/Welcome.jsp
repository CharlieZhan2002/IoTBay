<%-- 
    Document   : Welcome.jsp
    Created on : 2022年3月23日, 下午5:40:57
    Author     : zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String useremail =  request.getParameter("email");
        %>
        <h1>Hello <%= useremail %></h1>
    </body>
</html>
