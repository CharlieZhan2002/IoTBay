<%-- 
    Document   : Customer View
    Created on : May 11, 2022, 3:01:22 AM
    Author     : ettas
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
        <link rel="stylesheet" href="CustomerView.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Customer customer = (Customer) session.getAttribute("customer");
        %>
        <h1 class="cv_tit">IoTBay System</h1>
        </br>
        <div class="cv_cb">
            <p class="cv_cb_tit">Your Details</p>
            <div class="cv_cb_tb">
                <table class="cv_cb_tb_con">
                    <tr>
                        <td class="cv_td_head">Name</td><td class="cv_td_con">Details</td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Email</td><td class="cv_td_con">Email</td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Password</td><td class="cv_td_con">Password</td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Shipping Details</td><td class="cv_td_con">Shipping details</td> 
                    </tr>
                    <tr>
                        <td class="cv_td_head">Mobile Number</td><td class="cv_td_con">Mobile number</td>
                    </tr>
                </table>
                
            </div>
            <input class="cv_cb_btn" type="submit" value="Update Details"/>
        </div>
    </body>
</html>
