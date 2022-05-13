<%-- 
    Document   : ChooseProduct
    Created on : 2022年5月8日, 下午8:24:04
    Author     : zhang
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
        <link rel="stylesheet" href="ShowProduct.css">
        <title>JSP Page</title>
    </head>
    <%
        GetProductController db = new GetProductController();
        String pid = request.getParameter("pid");
        String pq = request.getParameter("pq");
        Product product = db.findpdata(pid);
        String pname = product.getPname();
        String type = product.getType();
        String price = product.getPrice();
    %>
    <body>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit" style="margin-bottom: 30px">Set Quantity</p>
            <form action="../ChooseProductServlet" method="post">
            <table class="pc_cb_tb_con" style="background-color: rgba(255,255,255,0.7);border: 0px solid">
                <tr>
                    <th style="width: 15%">Id</th>
                    <th style="width: 30%">Name</th>
                    <th style="width: 25%">Type</th>
                    <th style="width: 15%">Price</th>
                    <th style="width: 15%">Quantity</th>
                </tr>
                 <tr class="pc_cb_tb_con_data">
                        <td style="width: 15%"><%=pid%></td>
                        <td style="width: 30%"><%=pname %></td>
                        <td style="width: 25%"><%=type %></td>
                        <td style="width: 15%"><%=price %></td>
                        <td style="width: 15%"><input type="number" value="1" min="1" max="<%=pq %>" name="selectedQuantity" required="true"/></td>
                    </tr>  
            </table>
            <input class="pc_cb_btn" type="submit" value="Next">
            </form>
            <a class="pc_cb_bk" href='ShowProduct.jsp'>Back</a>
        </div>
    </body>
        <%
            session.setAttribute("pid", pid);      
            // String pquantity = request.getParameter("selectedQuantity");
            
            // session.setAttribute("pquantity", pquantity);
        %>
</html>
