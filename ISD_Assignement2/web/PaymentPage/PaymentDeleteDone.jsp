<%-- 
    Document   : DeleteDone
    Created on : 08/05/2022, 2:04:24 AM
    Author     : K
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
        <link rel="stylesheet" href="PaymentCreate.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
              GetPaymentController db = new GetPaymentController();        
             String  paymentID = request.getParameter("paymentID");
              Integer intpaymentID = Integer.parseInt(paymentID);            
              db.deletePayment(intpaymentID);
        %>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Create Payment</p>
            <p class="pc_dn">You Have Successfully Removed Payment Detail</p>
            <button class="pc_cb_btn" onclick="location.href ='PaymentList.jsp'">Back</button>
        </div>
    </body>
</html>
