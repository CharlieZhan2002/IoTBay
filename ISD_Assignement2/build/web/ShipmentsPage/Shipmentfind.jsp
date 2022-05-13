<%@page import="uts.isd.model.Shipment" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.util.logging.Logger" %>
<%@ page import="java.util.logging.Level" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="uts.isd.controller.*" %>
<%@ page import="uts.isd.model.dao.DBConnector" %>
<%@ page import="uts.isd.model.dao.DBManager" %>
<%@ page import="java.util.LinkedList" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Find Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="CustomerInfo.css">
</head>
<body>

<h1 class="m_cb_tit">Shipment Information System</h1></br>
<form action="../SearchShipmentServlet" method="post">
    <input class="lg_cb_ip" type="text" placeholder="Search Using ShipmentID" name="shipmentID" required="false">
    <input class="lg_cb_btn" type="submit" value="Search"/>
</form></br>

<div class="m_cb"></h1></br></br></br>
    <center>
        <table border="1" class="table_style">
            <tr>
                <th>Shipment</th>
                <th>OrderID</th>
                <th>Details</th>
                <th>ETA</th>
                <th>Status</th>
            </tr>
            <%
                try {
                    DBConnector connector = new DBConnector();
                    Connection conn = connector.openConnection();
                    DBManager db = new DBManager(conn);
                    String search_shipmentID = (String)session.getAttribute("shipmentID");
                    String shipmentID = request.getParameter("shipmentID");
                    Shipment shipment = db.findShipment(search_shipmentID);     
            %>
            <tr>
                <td><%=shipment != null ? shipment.getshipmentID() : "Current Null"%></td>
                <td><%=shipment != null ? shipment.getorderID()  : "Null"%></td>
                <td><%=shipment != null ? shipment.getDetails() : "Null"%></td>
                <td><%=shipment != null ? shipment.getETA() : "Null"%></td>
                <td><%=shipment != null ? shipment.getStatus() : "Null"%></td>
            </tr>
            <%
                    session.setAttribute("search_shipmentID", shipment.getshipmentID());
                    session.setAttribute("search_orderID", shipment.getorderID());
                    session.setAttribute("search_Details", shipment.getDetails());
                    session.setAttribute("search_ETA", shipment.getETA());
                    session.setAttribute("search_Status", shipment.getStatus());
                } catch (Exception e) {
                    Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, e);
                }
            %>
        </table>

        <div class="button_style">
            <form action="/ISD_Assignement2/ShipmentsPage/ShipmentInfo.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Back Previous</button>
            </form>
            
            <form action="ShipmentCrea.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Add Shipment</button>
            </form>

            <form action="ShipmentUpdate.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Edit Shipment</button>
            </form>
        </div>
    </center>
</div>    
        <h1>${search_email}</h1>

</body>
</html>
