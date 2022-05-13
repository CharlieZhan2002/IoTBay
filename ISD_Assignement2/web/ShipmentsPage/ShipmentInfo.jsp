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
    <title>Main Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="CustomerInfo.css">
</head>
<body>

<h1 class="m_cb_tit">Shipment Information System</h1></br>
<form action="../SearchShipmentServlet" method="post">
    <input class="lg_cb_ip" type="text" placeholder="Search Using ShipmentID" name="shipmentID">
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
                    
                    LinkedList<Shipment> allShipment = db.findAllShipment();
                    
                    for (Shipment shipment : allShipment) {
                        
            %>
           
            <tr>
                <td><%=shipment.getshipmentID()%></td></a>
                <td><%=shipment.getorderID()%></td>
                <td><%=shipment.getDetails()%></td>
                <td><%=shipment.getETA()%></td>
                <td><%=shipment.getStatus()%></td>
            </tr>
            
            <%
                    }
                } catch (Exception e) {
                    Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, e);
                }
            %>
        </table>

        <div class="button_style">
            <form action="ShipmentDelete.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Delete Shipment</button>
            </form>
            
            <form action="ShipmentCrea.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Add Shipment</button>
            </form>

            <form action="ShipmentUpdate.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Edit Shipment</button>
            </form>
            <form action="ShipmentSta.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Edit Status</button>
            </form>
            
            <form action="../WelcomePage/Welcome.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Back</button>
            </form>
        </div>
        <h4 align="center">If you want to delete and update Shipment please make sure they are not in process(Mean status is no "Ture")  </h2>
    </center>
</div>    
        <h1>${search_shipment}</h1>

</body>
</html>

