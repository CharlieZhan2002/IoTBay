/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package uts.isd.controller;

import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author ettas
 */
//@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            System.out.println("In the servlet");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            // TODO output your page here. You may use following sample code. 
            String regEmail = request.getParameter("email");
            String regFullName = request.getParameter("fullname");
            String regPwd = request.getParameter("password");
            String regPhone = request.getParameter("Phonenumber");
            String custAccess = "1";
            
            try {
                DBConnector connector = new DBConnector();
                Connection conn = connector.openConnection();
                DBManager db = new DBManager(conn);
                
                boolean emailExist = db.checkCustEmail(regEmail);
               System.out.println(emailExist);
                if (emailExist != true){
                    db.addCustomer(regFullName, regEmail, regPwd, null, custAccess, regPhone);
                    response.sendRedirect("/lotBay/LoginPage/Login.jsp");
                }
                else{
                    response.sendRedirect("/lotBay/RegisterPage/RegistrationError.jsp");
                }
                connector.closeConnection();
                
            }catch (ClassNotFoundException | SQLException ex){
             Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);       
        }
    }
}


 

  