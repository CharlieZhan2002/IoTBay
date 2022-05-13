<%@page import="uts.isd.model.Product"%>
<%@page import="uts.isd.model.Orderline"%>
<%@page import="uts.isd.model.User" %>
<%@ page import="uts.isd.model.Student" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.util.logging.Logger" %>
<%@ page import="java.util.logging.Level" %>
<%@ page import="uts.isd.model.Customer" %>
<%@ page import="uts.isd.model.Order" %>

<%@ page import="java.sql.SQLException" %>
<%@ page import="uts.isd.controller.TestDB" %>
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
    <link type="text/css" rel="stylesheet" href="OrderDisplay.css">
</head>
<body>

<h1 class="m_cb_tit">Order Search</h1></br>
<form action="../SearchAdminOrderServlet" method="post">
    <input class="lg_cb_ip" type="text" placeholder="Search Using Order ID" name="inputValue">
    <input class="lg_cb_btn" type="submit" value="Search"/>
</form></br>
 <div class="m_cb"></h1></br></br></br>
    <center>
        <table border="1" class="table_style">
            <tr>
                <th>Order ID</th>
                <th>Customer Email </th>
                <th>Order Status </th>
                <th>Generate Date</th>
                <th>Quantity </th>                
                <th>Product ID </th>                
                <th>Product </th>


            </tr>
            <%
                // int oid = (Integer)session.getAttribute("orderId");
                try {
                    DBConnector connector = new DBConnector();
                    Connection conn = connector.openConnection();
                    DBManager db = new DBManager(conn);
                    
                    String strOid = (String)session.getAttribute("orderId");
                    int oid = Integer.parseInt(strOid);
                    Orderline orderline = db.findOrderline(oid);
                    Product product = db.findProduct(String.valueOf(orderline.getProductId()));
                    Order order = db.findOrder(oid);  
                    
            %>
            
            <tr>
                <td><%=order != null ? order.getOrderID() : "Current Null"%></td>
                <td><%=order != null ? order.getCustomerEmail(): "Null"%></td>
                <td><%=order != null ? order.getStatus(): "Null"%></td>
                <td><%=order != null ? order.getGenerateDate(): "Null"%></td>
                <td><%=order != null ? order.getQuanlity(): "Null"%></td>
                <td><%=orderline != null ? orderline.getProductId(): "Null"%></td>
                <td><%=product != null ? product.getPname(): "Null"%></td>
            </tr>
            
            <%
                    
                } catch (Exception e) {
                    Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, e);
                }
            %>
        </table>     

        <div class="button_style">
            <form action="../CustomerInfo/AdminOrders.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Back Previous</button>
            </form>
            
            <form action="../AdminOrderDelete" method="post">
                <button class="lg_cb_btn" type="submit"/>Delete Order</button>
            </form>


        </div>
    </center>
</div>   
        
        <h1>${orderId}</h1>

</body>
</html>

