<%-- 
    Document   : ShipmentDelete
    Created on : 2022-5-5, 22:42:29
    Author     : QAQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="Shipments.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Please Type in Shipment ID that needs to be removed</p>
        <form action="ShipmentDeleteDone.jsp" method="post">
            <input class="pc_d_input" type="number" name="shipmentID" placeholder="Shipment ID" style="text-align: center" required="true">
            <br/>
            <button class="pc_cb_btn" type="submit">Delete</button>
        </form>
            <a class="pc_cb_bk" href="ShipmentInfo.jsp">Back</a>
        </div>
    </body>
</html>
