<%-- 
    Document   : ProductUpdate
    Created on : 2022年5月5日, 上午3:40:18
    Author     : yunwei zhang
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
            <p class="pc_cb_tit">Please Type in Shipment ID that needs to be update</p>
            <form action="ShipmentUpdateDone.jsp" method="post">
                <input class="pc_ud_input" style="width: 100px" name="shipmentID" placeholder="ShipmentID" required="true">
                <input class="pc_ud_input" style="width: 100px" name="Details" placeholder="Address" required="true">
               
                <br/>
            <button class="pc_cb_btn" type="submit">Update</button>
        </form>
            <a class="pc_cb_bk" href="ShipmentInfo.jsp">Back</a>
        </div>
    </body>
</html>
