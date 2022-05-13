/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uts.isd.model.dao.DBConnector;
import javax.servlet.http.HttpSession;
import uts.isd.model.Customer;
import uts.isd.model.dao.DBManager;

/**
 *
 * @author ettas
 */
public class MainServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);
            
            HttpSession session = request.getSession();
            if(session.getAttribute("custEmail") != null){
                String email = (String)session.getAttribute("custEmail");
                Customer customer = db.findCustbyEmail(email);
            
            
            session.setAttribute("name", customer.getCustFullName() );
            session.setAttribute("email", customer.getCustEmail());
            session.setAttribute("password", customer.getCustPwd());
            session.setAttribute("shipping", customer.getCustShippingAddr());
            session.setAttribute("phone", customer.getCustMobNo());   
        } else{
                session.setAttribute("name", "not registered");
                session.setAttribute("email", "not registered");
                session.setAttribute("password", "not registered");
                session.setAttribute("shipping", "not registered");
                session.setAttribute("phone", "not registered");
            }
            
           response.sendRedirect("/lotBay/CustomerAccount/Customer View.jsp");
           connector.closeConnection();
    } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    
}
