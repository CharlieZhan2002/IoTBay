<%@page import="uts.isd.model.PAYMENT"%>
<%@page import="uts.isd.model.PAYMENTT "%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="Payment.css">
        <title>Payment page</title>
    </head>
    <body>
        <%
             String paymentMethod = request.getParameter("paymentMethod");
            String  cardNumber = request.getParameter("cardNumber");
            String cardName = request.getParameter("cardName");
            String cardBSB = request.getParameter("cardBSB");
            String expireDate = request.getParameter("expireDate");
          
          
          
            %>
            
        <h1 class="r_tit">IOTBAY Payment System</h1>
        <br/>
        <div class="r_cb">
            <p class="r_cb_tit">Payment</p>
            <p class="r_cb_subtit">Please Enter the total price and date</p>
            <form action="../PaymentPage/Payment3.jsp" method="post">
                <p class="r_cb_iptite">The total price of the product</p>
                <input class="r_cb_ipe" type="text" placeholder="totalPrice" name="totalPrice" required="true">
                <p class="r_cb_iptite">Payment Date</p>
                <input class="r_cb_ipe" type="date" name="paymentDate" required="true">
                <input class="r_cb_btn" type="submit" value="next"/>
                <a class="r_cb_bk" href="../PaymentPage/Payment.jsp">Back to Payment details</a>
            </form>
        </div>
            <%
                     PAYMENT  payment = new PAYMENT (paymentMethod, cardName, cardBSB, cardNumber, expireDate);
                     System.out.println(payment.getPaymentMethod()) ;
          System.out.println(payment.getCardNumber()) ;
           System.out.println(payment.getTotalPrice()) ;
            System.out.println(payment.getPaymentDate()) ;
             
                     session.setAttribute("payment",payment);
              %>
                
    </body>
</html>
