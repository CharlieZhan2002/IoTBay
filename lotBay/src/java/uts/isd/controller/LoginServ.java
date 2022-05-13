/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import uts.isd.model.Customer;
import uts.isd.model.Staff;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ettas
 */
public class LoginServ extends HttpServlet {
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String email = request.getParameter("email");
            String pwd = request.getParameter("password");
            
            try{
                DBConnector connector = new DBConnector();
                Connection conn = connector.openConnection();
                DBManager db = new DBManager(conn);
                
                if(db.checkStaffByEmail(email) != false){ //Check if user is a staff 
                    boolean c = db.checkStaffByEmail(email);
                    System.out.println(c);
                    if(db.findStaff(email, pwd) != null) { //if its staff and staff exists 
                        String staffEmail = request.getParameter("email");
                        
                        HttpSession session = request.getSession();
                        session.setAttribute("staffEmail", staffEmail);
                        response.sendRedirect("../lotBay/WelcomePage/Welcome.jsp"); //direct staff to staff page 
                    } else { //staff is not found, error in login 
                        response.sendRedirect("/lotBay/LoginPage/LoginError.jsp");
                    }   
                }else{ //Not a staff
                    if(db.findCustomer(email, pwd) != null){ //customer exists
                       
                        String custEmail = request.getParameter("email");
                         System.out.println("email is " + custEmail);
                        HttpSession session = request.getSession();
                        session.setAttribute("custEmail", custEmail);
                        response.sendRedirect("/lotBay/WelcomePage/Welcome.jsp");
                    }else{//customer not found
                        response.sendRedirect("/lotBay/LoginPage/LoginError.jsp");
                    }
                }
                connector.closeConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            
             Logger.getLogger(LoginServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
