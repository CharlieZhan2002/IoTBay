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
        <link rel="stylesheet" href="Shipments.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ShipmentController db = new ShipmentController(); 
            String Details = request.getParameter("Details");
            String shipmentID = request.getParameter("shipmentID");

            db.updateShipment(shipmentID,Details);
        %>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Create Shipment</p>
            <p class="pc_dn">You Have Successfully Update Shipment</p>
            <button class="pc_cb_btn" onclick="location.href ='ShipmentInfo.jsp'">Back</button>
        </div>
    </body>
</html>
