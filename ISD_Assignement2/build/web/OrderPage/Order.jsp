<%-- 
    Document   : Main
    Created on : 2022-3-30, 14:24:27
    Author     : 12717
--%>

<%@page import="uts.isd.model.Product"%>
<%@page import="uts.isd.model.Customer"%>
<%@page import="uts.isd.model.dao.DBManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="uts.isd.model.dao.DBConnector"%>
<%@page import="uts.isd.model.User" %>

<%@ page import="uts.isd.model.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="Order.css">
</head>
<body>
<%
    // Student student = (Student) session.getAttribute("student");
    // String pquantity = request.getParameter("selectedQuantity");
    String strPid = (String)session.getAttribute("pid"); 
    String login_email = (String)session.getAttribute("login_email");
    DBConnector connector = new DBConnector();
    Connection conn = connector.openConnection();
    DBManager db = new DBManager(conn);
    Product product = db.findProduct(strPid);
    double pquantity = Double.parseDouble((String)session.getAttribute("pquantity"));
    double price = Double.parseDouble(product.getPrice());
    double total_price = price * pquantity;
%>
<h1 class="m_cb_tit">Welcome to Order Page</h1></br>
<div class="m_cb"></h1></br></br></br>

    <br/>
    <h1 class="m_cb_subtit">Order_ID: Generated after clicking Purchase</h1>
    <p class="m_cb_subtit"> Customer_Name: ${orderCustomerName}</P>
    <p class="m_cb_subtit"> Contact Email: ${login_email}</p>   
    <p class="m_cb_subtit"> Product ID: ${pid}</P>    
    <p class="m_cb_subtit"> Product Name: ${productName}</p>    
    <p class="m_cb_subtit"> Product Price: $<%=product.getPrice()%></P>
    <p class="m_cb_subtit"> Quanlity: ${pquantity}</p>
    <p class="m_cb_subtit"> Total Price $<%=total_price%></p>
    <br/>
    
    <a class="lg_cb_fp" href="../ShowProductPage/ShowProduct.jsp">Back to Product Page</a>
    <div class="btn">
        <form action="../OrderPage/OrderDisplay.jsp" method="post">
            <button class="lg_cb_btn" type="submit" value="post"/>History Order</button>
        </form>
        <form action="../PurchaseServlet" method="post">
            <button class="lg_cb_btn" type="submit" value="post"/>Purchase</button>
        </form>
    </div>
</div>



   
</body>
</html>

