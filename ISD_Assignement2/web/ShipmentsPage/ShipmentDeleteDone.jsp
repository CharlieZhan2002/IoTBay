<%-- 
    Document   : ShipmentDeleteDone
    Created on : 2022-5-5, 22:46:01
    Author     : QAQ
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
            String pdid = request.getParameter("shipmentID");

            db.deleteShipment(pdid);
        %>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Create Shipment</p>
            <p class="pc_dn">You Have Successfully Delete Shipment</p>
            <button class="pc_cb_btn" onclick="location.href ='ShipmentInfo.jsp'">Back</button>
        </div>
    </body>
</html>
