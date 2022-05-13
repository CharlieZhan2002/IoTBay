/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package uts.isd.controller;

import uts.isd.model.Customer;
import uts.isd.model.Student;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

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

/**
 *
 * @author huasongwen
 */
@WebServlet(name = "EditServlet", urlPatterns = {"/EditServlet"})
public class EditServlet extends HttpServlet {

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
            String email = (String)session.getAttribute("email");
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String address = request.getParameter("address");

            // 更新session

            Customer customer = db.findCustomer(email);

            session.setAttribute("password", customer.getUserPassword());
            session.setAttribute("name", customer.getFullName());
            session.setAttribute("dob", customer.getDateOfBirth());
            session.setAttribute("gender", customer.getGender());
            session.setAttribute("address", customer.getAddress());

            // 更新数据库
            db.updateCustomer(email, password, name, dob, gender, address);
            response.sendRedirect("/ISD_Assignement2/LogoutPage/Save.jsp");


            // 增
            //db.addCustomer("Jingsong@163.com", "110", "Jingsong" ,"2001-01-02");
            // System.out.println("Successfully Add Data");

            // 删
            //db.deleteCustomer("Qingyun@163.com");

            // 改
            //db.updateCustomer("Jingsong@163.com", "suasua", "Jingsong Pang", "2001-01-02");
            // System.out.println("Successfully Update Data");


            connector.closeConnection();
        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

        }


    }

}
