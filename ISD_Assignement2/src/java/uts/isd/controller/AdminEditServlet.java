/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.model.Customer;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

/**
 *
 * @author huasongwen
 */
@WebServlet(name = "AdminEditServlet", urlPatterns = {"/AdminEditServlet"})
public class AdminEditServlet extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        try {
            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);

            HttpSession session = request.getSession();
            String email = (String)session.getAttribute("search_email");
            // String email = request.getParameter("email");            
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String address = request.getParameter("address");

            db.updateCustomer(email, password, name, dob, gender, address);
            response.sendRedirect("/ISD_Assignement2/CustomerInfo/CustomerInfo.jsp");

            connector.closeConnection();
        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

        }
    }


}
