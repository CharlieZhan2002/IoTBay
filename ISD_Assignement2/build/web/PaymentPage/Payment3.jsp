<%-- 
    Document   : Payment3
    Created on : 02/05/2022, 5:32:42 PM
    Author     : K     
--%>

<%@page import="uts.isd.model.PAYMENT "%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="uts.isd.model.*"%>
<%@page import="uts.isd.model.dao.*"%>
<%@page import="uts.isd.controller.*"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="payment3.css">
        <title>Payment page</title>
    </head>
    <body>
   
      <%
            GetPaymentController db = new GetPaymentController(); 
            
            int OrderID = (Integer)session.getAttribute("OrderID");
            
            String paymentMethod = request.getParameter("paymentMethod");
            String  cardNumber = request.getParameter("cardNumber");
            String cardName = request.getParameter("cardName");
            String cardBSB = request.getParameter("cardBSB");
            String expireDate = request.getParameter("expireDate");
             String totalPrice = request.getParameter("totalPrice");
             String paymentDate = request.getParameter("paymentDate");
            db.addPayment(OrderID,paymentMethod, cardName, cardBSB, cardNumber, expireDate, totalPrice,paymentDate) ;
            %>
        <h1 class="r_tit">IOTBAY Payment System</h1>
        <br/>
        <div class="r_cb">
            <p class="r_cb_tit">Payment</p>
            <p class="r_cb_subtit">Please check all the payment details </p>
            <form action="../PaymentPage/CreatePaymentDone.jsp" method="post">
                  
                <p class="r_cb_iptited"> Your payment method is: <%=paymentMethod%></p>
                 <p class="r_cb_iptited"> Your card Number is:<%=cardNumber%></p>
                  
                  <p class="r_cb_iptited"> Your card Name  is:<%=cardName%></p>
                  
                  <p class="r_cb_iptited"> Your  card BSB is:<%=cardBSB%> </p>     
                  
                   <p class="r_cb_iptited"> Your card expired date is: <%=expireDate%></p>   
                   
                   <p class="r_cb_iptited"> Your product total price is: <%=totalPrice%> </p>
                    <p class="r_cb_iptited"> Your  payment Date is: <%=paymentDate%></p>
                
                
                <input class="r_cb_btn" type="submit" value="Submit the payment"/>
                           
                  <a class="r_cb_bk" href="../PaymentPage/Payment.jsp">Go back</a>
            </form>
        </div>
                      <%
                        //PAYMENT  payment = new PAYMENT (paymentMethod, cardName, cardBSB, cardNumber, expireDate, totalPrice,paymentDate,paymentID);
                         // session.setAttribute("payment",payment);
                           // System.out.println(payment.getTotalPrice()) ;
                          // System.out.println(payment.getPaymentDate()) ;
                          %>
    </body>
</html>
