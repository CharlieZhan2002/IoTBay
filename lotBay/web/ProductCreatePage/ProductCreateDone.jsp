<%-- 
    Document   : ProductCreateDone
    Created on : 2022年4月29日, 下午11:40:59
    Author     : yunwei zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.isd.model.*"%>
<%@page import="uts.isd.model.dao.*"%>
<%@page import="uts.isd.controller.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="ProductCreate.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            GetProductController db = new GetProductController(); 
            String pid = request.getParameter("pid");
            String pname = request.getParameter("pname");
            String type = request.getParameter("type");
            String price = request.getParameter("price");
            String quantity = request.getParameter("quantity");

            db.addpdata(pid,pname,type,price,quantity);
            %>
            <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Create Product</p>
            <p class="pc_dn">You Have Successfully Creaated New Product</p>
            <button class="pc_cb_btn" onclick="location.href ='ProductCreate.jsp'">Back</button>
        </div>
    </body>
</html>
