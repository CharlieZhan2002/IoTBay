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
import uts.isd.model.Staff;
import uts.isd.model.dao.DBManager;

/**
 *
 * @author ettas
 */
public class StaffViewServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);
            
            HttpSession session = request.getSession();
            if(session.getAttribute("staffEmail") != null){
                String email = (String)session.getAttribute("staffEmail");
                Staff staff = db.findStaffbyEmail(email);
            
            
            session.setAttribute("name", staff.getStaffFullName() );
            session.setAttribute("email", staff.getStaffEmail());
            session.setAttribute("password", staff.getStaffPwd());
            session.setAttribute("phone", staff.getStaffMobNo());   
        } else{
                session.setAttribute("name", "not registered");
                session.setAttribute("email", "not registered");
                session.setAttribute("password", "not registered");
                session.setAttribute("phone", "not registered");
            }
            
           response.sendRedirect("/lotBay/StaffPages/StaffView.jsp");
           connector.closeConnection();
    } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    

}
