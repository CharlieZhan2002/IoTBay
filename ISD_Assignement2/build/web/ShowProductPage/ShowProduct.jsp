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
            <p class="pc_cb_tit">Products</p>
            <div class="pc_cb_tb">
                <table class="pc_cb_tb_con">
                <tr>
                    <th style="width: 10%">Id</th>
                    <th style="width: 25%">Name</th>
                    <th style="width: 20%">Type</th>
                    <th style="width: 15%">Price</th>
                    <th style="width: 10%">Quantity</th>
                    <th style="width: 25%"></th>
                </tr>
            <%
            GetProductController db = new GetProductController();
            Product [] pdata = new Product[db.getpdata().length];
            pdata = db.getpdata();
                for(int i=0; i<db.getpdata().length; i++){
                    if(pdata[i]!=null){%>
                    <tr class="pc_cb_tb_con_data">
                        <td style="width: 10%"><%=pdata[i].getPid()%></td>
                        <td style="width: 25%"><%=pdata[i].getPname() %></td>
                        <td style="width: 20%"><%=pdata[i].getType() %></td>
                        <td style="width: 15%"><%=pdata[i].getPrice() %></td>
                        <td style="width: 10%"><%=pdata[i].getQuantity() %></td>
                        <td style="width: 25%">
                            <button class="pc_choose_btn" onclick="handleSelect(<%=pdata[i].getPid()%>,<%=pdata[i].getQuantity()%>)">Select</button>
                        </td>

                    </tr>
                    <%} 
                }
            %>   
            </table>
            </div>
            <a class="pc_cb_bk" href='../WelcomePage/Welcome.jsp'>Back</a>
        </div>
            <script>
                function handleSelect(p, q){
                    window.location="ChooseProduct.jsp?pid="+ p+ "&pq=" + q;
                }
            </script>
    </body>
</html>
