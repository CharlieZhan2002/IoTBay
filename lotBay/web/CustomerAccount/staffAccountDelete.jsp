<%-- 
    Document   : staffAccountDelete
    Created on : May 13, 2022, 2:32:59 AM
    Author     : ettas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Save page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="CustomerView.css">
</head>
<body>
<!<!-- ../index page/index.jsp -->

    <h1 class="cv_cb_tit">Delete Account</h1><br/>
    <div style="height: 350px;"class="sv_cb"><br/><br/><br/><br/>
        <p class="sv_cb_subtit" style="width: 300px; text-align: centre; margin-left: 50px; ">You are about to delete your account. All records would be deleted if you choose to continue.</p>
        <p class="sv_cb_subtit">Confirm Account Deletion?</p>
        </br>
        
         <form method="POST" action="/lotBay/StaffPages/StaffView.jsp">  
                <input style="margin-left: 35px; margin-top: 20px;"class="cv_cb_btnr" type="submit" value="Cancel"/>  
        </form> 
         <form method="POST" action="../staffDeleteAcctServlet">  
                <input style="margin-right: 20px;"class="cv_cb_btn" type="submit" value="Confirm"/>  
        </form> 

</div>
</body>
</html>
