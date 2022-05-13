<%@page import="uts.isd.model.User" %>
<%@ page import="uts.isd.model.Student" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.util.logging.Logger" %>
<%@ page import="java.util.logging.Level" %>
<%@ page import="uts.isd.model.Customer" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="uts.isd.controller.TestDB" %>
<%@ page import="uts.isd.model.dao.DBConnector" %>
<%@ page import="uts.isd.model.dao.DBManager" %>
<%@ page import="java.util.LinkedList" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="CustomerInfo.css">
</head>
<body>

<h1 class="m_cb_tit">Customer Information System</h1></br>
<form action="../SearchCustomerServlet" method="post">
    <input class="lg_cb_ip" type="text" placeholder="Search Using Email" name="email" required="false">
    <input class="lg_cb_btn" type="submit" value="Search"/>
</form></br>

<div class="m_cb"></h1></br></br></br>
    <center>
        <table border="1" class="table_style">
            <tr>
                <th>Email:</th>
                <th>Password:</th>
                <th>Full Name:</th>
                <th>Date of Birthday:</th>

            </tr>
            <%
                try {
                    DBConnector connector = new DBConnector();
                    Connection conn = connector.openConnection();
                    DBManager db = new DBManager(conn);
                    String search_email = (String)session.getAttribute("search_email");
                    String login_email = request.getParameter("email");
                    Customer customer = db.findCustomer(search_email);     
            %>
            <tr>
                <td><%=customer != null ? customer.getEmail() : "Current Null"%></td>
                <td><%=customer != null ? customer.getUserPassword()  : "Null"%></td>
                <td><%=customer != null ? customer.getFullName() : "Null"%></td>
                <td><%=customer != null ? customer.getDateOfBirth() : "Null"%></td>
            </tr>
            <%
                    session.setAttribute("search_userPassword", customer.getUserPassword());
                    session.setAttribute("search_fullName", customer.getFullName());
                    session.setAttribute("search_dateOfBirth", customer.getDateOfBirth());
                    session.setAttribute("search_gender", customer.getGender());
                    session.setAttribute("search_address", customer.getAddress());
                } catch (Exception e) {
                    Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, e);
                }
            %>
        </table>

        <div class="button_style">
            <form action="CustomerInfo.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Back Previous</button>
            </form>
            
            <form action="../AdminRemoveServlet" method="post">
                <button class="lg_cb_btn" type="submit"/>Remove It</button>
            </form>
            
            <form action="AdminEdit.jsp" method="post">
                <button class="lg_cb_btn" type="submit" value="post"/>Edit Customer</button>
            </form>
        </div>
    </center>
</div>    
        <h1>${search_email}</h1>

</body>
</html>

