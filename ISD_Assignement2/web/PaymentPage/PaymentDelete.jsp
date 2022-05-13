<%-- 
    Document   : Delete
    Created on : 08/05/2022, 2:02:30 AM
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
            <p class="pc_cb_tit">Please Type in Payment ID that needs to be removed</p>
        <form action="PaymentDeleteDone.jsp" method="post">
           
            <input class="pc_d_input" name="paymentID" placeholder="Payment ID" style="text-align: center" required="true">
            <br/>
            <button class="pc_cb_btn" type="submit">Delete</button>
        </form>
            <a class="pc_cb_bk" href="PaymentList.jsp">Back</a>
        </div>
    </body>
</html>
