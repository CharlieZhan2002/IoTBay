<%-- 
    Document   : PaymentUpdate
    Created on : 09/05/2022, 3:03:45 PM
    Author     : K
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="PaymentCreate.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Please Type in Payment ID that needs to be update</p>
            <form action="PaymentUpdateDone.jsp" method="post">
                <input class="pc_ud_input" style="width: 100px" name="paymentID" placeholder="Id" required="true">
                <input class="pc_ud_input" style="width: 100px" name="paymentMethod" placeholder="Payment Method" required="true">
                <input class="pc_ud_input" style="width: 100px" name="cardName" placeholder="Card Name" required="true">
                <input class="pc_ud_input" style="width: 100px" name="cardNumber" placeholder="Card Number" required="true">
                <input class="pc_ud_input" style="width: 100px" name="cardBSB" placeholder="Card BSB" required="true">
                <input class="pc_ud_input" style="width: 100px" name="expireDate" placeholder="Card expired Date" required="true">
                <input class="pc_ud_input" style="width: 100px" name="totalPrice" placeholder="Total Price" required="true">
                <input class="pc_ud_input" style="width: 100px" name="paymentDate" placeholder="Payment Date" required="true">
                
                <br/>
            <button class="pc_cb_btn" type="submit">Update</button>
        </form>
            <a class="pc_cb_bk" href="PaymentList.jsp">Back</a>
        </div>
    </body>
</html>
