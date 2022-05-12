<%-- 
    Document   : StaffView
    Created on : May 13, 2022, 1:04:04 AM
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
        <link rel="stylesheet" href="StaffView.css">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1 class="cv_tit">IoTBay System</h1>
        </br>
        <div class="cv_cb">
            <p class="cv_cb_tit">My Profile</p>
            <div class="cv_cb_tb">
                <table class="cv_cb_tb_con">
                    <tr>
                        <td class="cv_td_head">Name</td><td class="cv_td_con">${name}</td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Email</td><td class="cv_td_con">${email}</td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Password</td><td class="cv_td_con">
                            <p style="display:none" id="pw">${password}</p>
                        </td>
                        <td style="width: 25%">
                            <button class="cv_sh_btn"onclick="showHide()">Show/Hide</button>
                        </td>
                    </tr>
                    <tr>
                        <td class="cv_td_head">Mobile Number</td><td class="cv_td_con">${phone}</td>
                    </tr>
                </table>
                
            </div>
                    <form method="POST" action="../CustomerAccount/StaffEditAccount.jsp">  
                           <input class="cv_cb_btnr" type="submit" value="Update Details"/>  
                    </form> 
                    
                    <form method="POST" action="../LogoutPage/StaffLogout.jsp">  
                           <input class="cv_cb_btn" type="submit" value="Logout"/>  
                    </form> 
                    
        </div>
                    <script>
                function showHide(){
                   var x = document.getElementById("pw");
                   if(x.style.display === "none"){
                       x.style.display = "block";}
                   else{
                       x.style.display = "none";
                   }
                }
            </script>
    </body>
</html>
