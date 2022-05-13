<%-- 
    Document   : PaymentFind
    Created on : 09/05/2022, 5:30:21 PM
    Author     : K
--%>
<%@page import="uts.isd.model.User" %>
<%@ page import="uts.isd.model.PAYMENT" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.util.logging.Logger" %>
<%@ page import="java.util.logging.Level" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="uts.isd.model.dao.DBConnector" %>
<%@ page import="uts.isd.model.dao.DBManager" %>
<%@ page import="uts.isd.controller.GetPaymentController" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="PaymentCreate.css">
</head>
<body>

<h1 class="pc_tit">Payment Detail Search</h1></br>
<form action="../PaymentFindServlet" method="post">
    <input class="lg_cb_ip" type="text" placeholder="Search by PaymentID" name="inputValue">
    <input class="lg_cb_ip" type="text" placeholder="Search by PaymentDate" name="InputValue">
    <input class="lg_cb_btn" type="submit" value="Search"/>
</form></br>
 <div class="pc_cbe">
 <div class="m_cb"></h1></br></br></br>
    <center>
        <table border="1" class="table_style">
            <tr>
                    <th style="width: 15%">PaymentID</th>
                    <th style="width: 15%">OrderID</th>
                    <th style="width: 15%">PaymentMethod</th>
                    <th style="width: 30%">CardName</th>
                    <th style="width: 15%">CardNumber</th>
                     <th style="width: 25%">CardBSB</th>
                    <th style="width: 15%">ExpireDate</th>
                    <th style="width: 15%">TotalPrice</th>
                     <th style="width: 15%">PaymentDate</th>
            </tr>
            <%
                try {
                    DBConnector connector = new DBConnector();
                    Connection conn = connector.openConnection();
                    DBManager db = new DBManager(conn);
                    int pid = (Integer)session.getAttribute("search_pid");
                     String pdate = (String)session.getAttribute("search_pdate");
                    
                    PAYMENT payment = db.findPayment(pid,pdate);  
            %>
           
            <tr>
                <td><%=payment != null ? payment.getPaymentID() : "Current Null"%></td></a>
                <td><%=payment != null ? payment.getOrderID(): "Null"%></td>
                <td><%=payment != null ? payment.getPaymentMethod(): "Null"%></td>
                <td><%=payment != null ? payment .getCardName(): "Null"%></td>
                <td><%=payment != null ? payment.getCardNumber(): "Null"%></td>
                 <td><%=payment != null ? payment.getCardBSB(): "Null"%></td>
                  <td><%=payment != null ? payment.getExpireDate(): "Null"%></td>
                   <td><%=payment != null ? payment.getTotalPrice(): "Null"%></td>
                    <td><%=payment != null ? payment.getPaymentDate(): "Null"%></td>
            </tr>
            
            <%
                    
                } catch (Exception e) {
                    Logger.getLogger(GetPaymentController.class.getName()).log(Level.SEVERE, null, e);
                }
            %>
        </table>

        <div class="button_style">
            <form action="../PaymentPage/PaymentList.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Back Previous</button>
            </form>
            
            


        </div>
    </center>
</div>   
        <h1>${search_oid}</h1>

</body>
</html>

