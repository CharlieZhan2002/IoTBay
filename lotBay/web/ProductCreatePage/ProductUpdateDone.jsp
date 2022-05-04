<%-- 
    Document   : ProductUpdateDone
    Created on : 2022年5月5日, 上午3:42:08
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
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="ProductCreate.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            GetProductController db = new GetProductController(); 
            String pdid = request.getParameter("pdid");
            String pdname = request.getParameter("pdname");
            String pdtype = request.getParameter("pdtype");
            String pdprice = request.getParameter("pdprice");
            String pdquantity = request.getParameter("pdquantity");
            db.updatepdata(pdid,pdname,pdtype,pdprice,pdquantity);
        %>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Create Product</p>
            <p class="pc_dn">You Have Successfully Update Item</p>
            <button class="pc_cb_btn" onclick="location.href ='ProductCreate.jsp'">Back</button>
        </div>
    </body>
</html>
