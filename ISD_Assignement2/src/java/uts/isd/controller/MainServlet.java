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
@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // work in do post method
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // accept username and password from index.html file
        // String password = request.getParameter("password");

        // out.println(email);

        try {

            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);

            // 查
            /*
            Student songwen = db.findStudent("songwen-1@163.com", "233450");
            System.out.println(songwen);

            Student bob = db.findStudent("bob-1@163.com");
            System.out.println(bob);

            Customer test = db.findCustomer("test@.com");
            System.out.println(test);
            */
            // System.out.println(db.findStudent(email, password));
            HttpSession session = request.getSession();
            if (session.getAttribute("login_email") != null){
                String email = (String)session.getAttribute("login_email");
                Customer customer = db.findCustomer(email);

                // out.println(customer);

                session.setAttribute("email", customer.getEmail());
                session.setAttribute("password", customer.getEmail());
                session.setAttribute("name", customer.getFullName());
                session.setAttribute("dob", customer.getDateOfBirth());
            }else{
                // 这里说明是 anonymous对象
                session.setAttribute("email", "not registered");
                session.setAttribute("password", "not registered");
                session.setAttribute("name", "Anonymous");
                session.setAttribute("dob", "not registered");
            }


            response.sendRedirect("/ISD_Assignement2/MainPage/Main.jsp");


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
