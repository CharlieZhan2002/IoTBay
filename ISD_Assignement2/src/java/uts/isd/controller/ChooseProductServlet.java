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
import uts.isd.model.Product;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

/**
 *
 * @author huasongwen
 */
@WebServlet(name = "ChooseProductServlet", urlPatterns = {"/ChooseProductServlet"})
public class ChooseProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                // work in do post method
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        try {

            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);
        // 我跳转到页面之前, 需要传递session并创建order, 打入数据库

        // 通过id查到Product_Name
            Product product = db.findProducts((String) session.getAttribute("pid"));
            
            session.setAttribute("productName", product.getPname());
        // 通过email查到Customer_Name
        Customer customer = db.findCustomer((String) session.getAttribute("login_email"));
        
        session.setAttribute("orderCustomerName", customer.getFullName());
        // 插入数据到Orders
        
        String pquantity = request.getParameter("selectedQuantity");


        session.setAttribute("pquantity", pquantity);

        
        



        response.sendRedirect("/ISD_Assignement2/OrderPage/Order.jsp");
                } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
