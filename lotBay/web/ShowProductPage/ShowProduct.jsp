<%-- 
    Document   : ShowProduct
    Created on : 2022年5月5日, 上午4:00:39
    Author     : yunwei zhang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="uts.isd.model.*"%>
<%@page import="uts.isd.model.dao.*"%>
<%@page import="uts.isd.controller.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="ShowProduct.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="pc_tit">IotBay System</h1>
        <br/>
        <div class="pc_cb">
            <p class="pc_cb_tit">Create Product</p>
            <div class="pc_cb_tb">
                <table class="pc_cb_tb_con">
                <tr>
                    <th style="width: 15%">Id</th>
                    <th style="width: 30%">Name</th>
                    <th style="width: 25%">Type</th>
                    <th style="width: 15%">Price</th>
                    <th style="width: 15%">Quantity</th>
                </tr>
            <%
            GetProductController db = new GetProductController();
            Product [] pdata = new Product[db.getpdata().length];
            pdata = db.getpdata();
                for(int i=0; i<db.getpdata().length; i++){
                    if(pdata[i]!=null){%>
                    <tr class="pc_cb_tb_con_data">
                        <td style="width: 15%"><%=pdata[i].getPid()%></td>
                        <td style="width: 30%"><%=pdata[i].getPname() %></td>
                        <td style="width: 25%"><%=pdata[i].getType() %></td>
                        <td style="width: 15%"><%=pdata[i].getPrice() %></td>
                        <td style="width: 15%"><%=pdata[i].getQuantity() %></td>

                    </tr>
                    <%} 
                }
            %>   
            </table>
            </div>
            <a class="pc_cb_bk" href='../WelcomePage/Welcome.jsp'>Back</a>
        </div>
    </body>
</html>
