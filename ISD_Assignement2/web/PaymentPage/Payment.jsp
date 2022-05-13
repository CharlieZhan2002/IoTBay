<%-- 
    Document   : Payment.jsp
    Created on : 30/04/2022, 10:24:08 PM
    Author     : K
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="edit.css">
        <title>Payment page</title>
    </head>
    <body>
        <h1 class="r_tit">IOTBAY Payment System</h1>
        <br/>
        <div class="r_cb">
            <p class="r_cb_tit">Payment</p>
            <p class="r_cb_subtit">Please Enter Your payment details</p>
            <form action="../PaymentPage/Payment3.jsp" method="post">
                <p class="r_cb_iptit">Your payment method</p>
                 <label class="r_cb_pmi" for="paymentMethod">Choose your payment method:</label>
                 <select class="r_cb_ip" id="paymentMethod" name="paymentMethod" >
                     <option value="Credit Card">Credit Card</option>
                     <option value="Debit Card">Master Card</option>
                     <option value="Gift Card">Gift Card</option>
                 </select>
                   <p class="r_cb_iptit">Your payment Number</p>
           
                <input class="r_cb_ip" type="number" placeholder="cardNumber" name="cardNumber" >     
                <p class="r_cb_iptit">Your Card Name</p>
                <input class="r_cb_ip" type="text" placeholder="cardName" name="cardName" >                            
                <p class="r_cb_iptit">Your Card BSB</p>
                <input class="r_cb_ip" type="number" placeholder="cardBSB" name="cardBSB" >
                <p class="r_cb_iptit">Your Card expired Date</p>
                <input class="r_cb_ip" type="date" name="expireDate" required="true">  
                <p class="r_cb_iptit">The total price of the product</p>
                <input class="r_cb_ip" type="number" placeholder="totalPrice" name="totalPrice" required="true">
                <p class="r_cb_iptit">Payment Date</p>
                <input class="r_cb_ip" type="date" name="paymentDate" required="true">
                <input class="r_cb_btn" type="submit" value="next"/>
                 <a class="r_cb_bk" href="../MainPage/Main.jsp">Back to Main Page</a>
            </form>
        </div>
        <h1>Order ID: ${OrderID}</h1>
    </body>
</html>
