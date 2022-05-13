<%-- 
    Document   : EditAccount
    Created on : May 12, 2022, 10:05:02 PM
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
         <h1 class="cv_tit">IoTBay System</h1>
        </br>
        <div class="cv_cb">
            <p class="cv_cb_tit">Update Profile Details</p>
            <form action="../CustUpdateAcct" method="post">
            <div class="cv_cb_tb">
                <table class="cv_cb_tb_con">
                    <tr>
                        <td class="cv_td_head">Name</td>
                        <td class="cv_td_con">
                            <input class="ea_cb_ip" type="text" value="${name}" name="name">
                        </td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Email</td>
                        <td class="cv_td_con">
                            <input class="ea_cb_ip" type="text" value="${email}" name="email" required="true" readonly="readonly">
                        </td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Password</td>
                        <td class="cv_td_con">
                           <input class="ea_cb_ip" type="password" value="${password}" name="password">
                        </td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Shipping Details</td>
                        <td class="cv_td_con">
                            <input class="ea_cb_ip" type="text" value="${shipping}" name="shipping">
                        </td> 
                    </tr>
                    <tr>
                        <td class="cv_td_head">Mobile Number</td>
                        <td class="cv_td_con">
                            <input class="ea_cb_ip" type="text" value="${phone}" name="phone">
                        </td>
                    </tr>
                </table>
                
            </div>   
                     
                    
                    <input class="cv_cb_btn" type="submit" value="Save"/>
                    <a class="ea_cb_su" href="Customer View.jsp">Cancel</a>
                    
            </form>
                         <form method="POST" action="AccountDelete.jsp">  
                         <input style="margin-left: 50px;"class="sv_cb_btn" type="submit" value="Delete"/>  
                     </form> 
        </div>
    </body>
</html>
