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

<h1 class="m_cb_tit">Order Display</h1></br>
<form action="../SearchOrderServlet" method="post">
    <input class="lg_cb_ip" type="text" placeholder="Search Using Order ID" name="inputValue">
    <input class="lg_cb_btn" type="submit" value="Search"/>
</form></br>

<div class="m_cb"></h1></br></br></br>
    <center>
        <table border="1" class="table_style">
            <tr>
                <th>Order ID:</th>
                <th>Customer Email </th>
                <th>Order Status </th>
                <th>Generate Date</th>
                <th>Quantity </th>
                <th>Product ID </th>
                <th>Product Name </th>
            </tr>
            <%
                try {
                    String login_email = (String)session.getAttribute("login_email");
                    DBConnector connector = new DBConnector();
                    Connection conn = connector.openConnection();
                    DBManager db = new DBManager(conn);
                    LinkedList<Order> allOrders= db.findAllOrders();
                    // LinkedList<Customer> allCustomer = db.findAllCustomer();
                    LinkedList<Orderline> orderlines = db.findAllOrderline();
                    // login_email
                    for(Orderline orderline :orderlines){
                        for (Order order : allOrders) {
                            if(order.getCustomerEmail().trim().equals(login_email.trim())){
                                if(order.getOrderID() == orderline.getOrderId()){
                                    Product product = db.findProduct(String.valueOf(orderline.getProductId()));
                        
            %>
            <tr>
                <td><%=order.getOrderID()%></td></a>
                <td><%=order.getCustomerEmail()%></td>
                <td><%=order.getStatus()%></td>
                <td><%=order.getGenerateDate()%></td>
                <td><%=order.getQuanlity()%></td>
                <td><%=orderline.getProductId()%></td>
                <td><%=product.getPname()%></td>
            </tr>
            
            <%                  
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, e);
                }
            %>
        </table>

        <div class="button_style">
            <form action="../OrderPage/Order.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Back Previous</button>
            </form>
            
            <form action="OrderSearch.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Delete Order</button>
            </form>


        </div>
    </center>
</div>    
        <h1>${login_email}</h1>

</body>
</html>

