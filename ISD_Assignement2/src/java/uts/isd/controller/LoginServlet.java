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
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // work in do post method
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // accept username and password from index.html file
        String email = request.getParameter("email");
        String password = request.getParameter("password");
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

            if (db.findCustomer(email, password) != null) {
                // 向Welcome 页面传递数据
                String login_email = request.getParameter("email");
                // request.setAttribute("login_email", login_email);
                
                // out.println(request.getAttribute("login_email"));
                
                // request.getRequestDispatcher("/WelcomePage/Welcome.jsp").include(request, response);
                HttpSession session = request.getSession();
                session.setAttribute("login_email", login_email);
                response.sendRedirect("/ISD_Assignement2/WelcomePage/Welcome.jsp");
            }else{
                // db.findCustomer(email, password) 查出的的结果为空的话, 那就是意味着没有查到内容, 内容不存在. 
                //out.println(db.findCustomer(email, password));
                //out.println(email);
                //out.println(password);
                //out.println("Wrong userName and password...");
                response.sendRedirect("/ISD_Assignement2/ErrorPage/Error.jsp");
            }

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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */


}
