<%-- 
    Document   : CheckProduct
    Created on : 2022年5月8日, 下午9:55:52
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
            String pquantity = request.getParameter("selectedQuantity");
            String pid = (String)session.getAttribute("pid");
        %>
        <p>id is: </p><%=pid %>
        <p>quantity is: </p><%=pquantity %>
    </body>
</html>
