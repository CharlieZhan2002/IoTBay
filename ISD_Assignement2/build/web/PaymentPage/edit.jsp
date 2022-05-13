<%-- 
    Document   : edit
    Created on : 03/05/2022, 8:33:01 PM
    Author     : K
--%>

<%@page import="uts.isd.model.PAYMENT "%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="edit.css">
        <title>Payment Page</title>
    </head>
    <body>
        <%
            PAYMENT payment = (PAYMENT)session.getAttribute("payment");
            String updated = request.getParameter("updated");
         %>
         <h1 class="r_tit">Payment details </h1>
         <br/>
        <div class="r_cb">
            <p class="r_cb_tit">Edit your payment information <span> <%=(updated !=null) ? "Update was successful":""%></span></p>
        <form action="../PaymentPage/edit.jsp" method="post">
            <p class="r_cb_iptit">Your payment method</p>
                 <input class="r_cb_ip" type="text" name="paymentMethod" value="${payment.paymentMethod}" required="true">
                <p class="r_cb_iptit">Your card Number</p>
                <input class="r_cb_ip" type="text" name="cardNumber"  value="${payment.cardNumber}"  required="true">
                <p class="r_cb_iptit">Your Card Name</p>
                <input class="r_cb_ip" type="text"  name="cardName"  value="${payment.cardName}" required="true">
                <p class="r_cb_iptit">Your Card BSB</p>
                <input class="r_cb_ip" type="text" name="cardBSB"  value="${payment.cardBSB}" required="true">
                <p class="r_cb_iptit">Your Card expired Date</p>
                <input class="r_cb_ip" type="date" name="expireDate"  value="${payment.expireDate}" required="true">
                 <p class="r_cb_iptit">The total price of the product</p>
                <input class="r_cb_ip" type="text" name="totalPrice" value="${payment.totalPrice}"  required="true">
                <p class="r_cb_iptit">Payment Date</p>
                <input class="r_cb_ip" type="date" name="paymentDate"  value="${payment.paymentDate}" required="true">
                <input class="r_cb_btn" type="submit" value="Update"/>
                <a class="r_cb_bk" href="../PaymentPage/editafter.jsp">Next</a>
                <input type ="hidden" name="updated" value="updated">
            </form>
                      <%
                                String paymentMethod = request.getParameter("paymentMethod");
                                String cardName = request.getParameter("cardName");
                                String cardBSB = request.getParameter("cardBSB");
                                String  cardNumber = request.getParameter("cardNumber");
                                String expireDate = request.getParameter("expireDate");
                                String totalPrice = request.getParameter("totalPrice");
                                String paymentDate = request.getParameter("paymentDate");
                                payment = new PAYMENT (paymentMethod,cardNumber,cardName,cardBSB,expireDate,totalPrice,paymentDate);
                                session.setAttribute("payment",payment);
                     %>
                     
    </body>
</html>
