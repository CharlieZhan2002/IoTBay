<%-- 
    Document   : ProductDelete
    Created on : 2022年5月5日, 上午3:23:09
    Author     : yunwei zhang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="ProductCreate.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Please Type in Product ID that needs to be removed</p>
        <form action="ProductDeleteDone.jsp" method="post">
            <input class="pc_d_input" name="pdid" placeholder="Product Id" style="text-align: center" required="true">
            <br/>
            <button class="pc_cb_btn" type="submit">Delete</button>
        </form>
            <a class="pc_cb_bk" href="ProductCreate.jsp">Back</a>
        </div>
    </body>
</html>
