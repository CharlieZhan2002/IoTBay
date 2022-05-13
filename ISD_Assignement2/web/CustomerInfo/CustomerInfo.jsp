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
    <input class="lg_cb_ip" type="text" placeholder="Search Using Email" name="email">
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
                <th>Gender</th>
                <th>Address</th>
            </tr>
            <%
                try {
                    DBConnector connector = new DBConnector();
                    Connection conn = connector.openConnection();
                    DBManager db = new DBManager(conn);
                    
                    LinkedList<Customer> allCustomer = db.findAllCustomer();
                    
                    for (Customer customer : allCustomer) {
                        
            %>
           
            <tr>
                <td><%=customer.getEmail()%></td></a>
                <td><%=customer.getUserPassword()%></td>
                <td><%=customer.getFullName()%></td>
                <td><%=customer.getDateOfBirth()%></td>
                <td><%=customer.getGender()%></td>
                <td><%=customer.getAddress()%></td>
            </tr>
            
            <%
                    }
                } catch (Exception e) {
                    Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, e);
                }
            %>
        </table>

        <div class="button_style">
            <form action="../index page/index.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Back Previous</button>
            </form>
            
            <form action="CustomerAdd.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Add Customer</button>
            </form>

            <form action="CustomerSearch.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Edit Customer</button>
            </form>
            
            <form action="AdminOrders.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>All Orders</button>
            </form>
        </div>
            <form action="../ProductCreatePage/ProductCreate.jsp" method="post">
                <button class="lg_cb_btn" type="submit"/>Product Admin</button>
            </form>
    </center>
</div>    
        <h1>${search_email}</h1>

</body>
</html>

