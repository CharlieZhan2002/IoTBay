/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.model.Customer;
import uts.isd.model.dao.DBManager;

/**
 *
 * @author ettas
 */

public class CustRegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param servlet request
     * @param servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override 
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        
        String regEmail = request.getParameter("email");
        String regFullName = request.getParameter("fullname");
        String regPwd = request.getParameter("password");
        String regPhone = request.getParameter("phone");
        
        DBManager db = (DBManager) session.getAttribute("manager");
        
        if (!validator.ValidateName(regFullName)){
            session.setAttribute("nameErr", "Invalid name formatting");
            request.getRequestDispatcher("Register.jsp").include(request, response);
        }else if (!validator.ValidateEmail(regEmail)){
            session.setAttribute("emailErr", "Invalid email");
            request.getRequestDispatcher("Register.jsp").include(request, response);
        }else if (!validator.ValidatePassword(regPwd)){
            session.setAttribute("passErr", "Invalid password");
            request.getRequestDispatcher("Register.jsp").include(request, response);
        }else if (!validator.ValidatePhone(regPhone)){
            session.setAttribute("phoneErr","Invalid phone number");
            request.getRequestDispatcher("Register.jsp").include(request, response);
        } else{
            try{ 
                Customer check = db.findCustEmail(regEmail); //check customer existence
                if (check == null){
                    db.addCustomer(regFullName, regEmail, regPwd, regPhone, 1, regPhone);
                    Customer customer = db.findCustEmail(regEmail);
                    session.setAttribute("customer", customer );
                    request.getRequestDispatcher("Welcome.jsp").include(request, response); 
                }
                else{
                    session.setAttribute("existErr", "There is already an account with this Email");
                    request.getRequestDispatcher("Register.jsp").include(request, response);               
                }
            }
            catch (SQLException | NullPointerException e){
                System.out.println(e.getMessage() == null? "Customer doesn't exist" : "Welcome to IoTBay");
        }
     }
        validator.clear(session);
    
    }
}
   