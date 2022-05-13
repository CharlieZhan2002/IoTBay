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
import javax.servlet.http.HttpSession;
import uts.isd.model.Staff;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

/**
 *
 * @author ettas
 */
public class StaffUpdateAcct extends HttpServlet {

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);

            HttpSession session = request.getSession();
            String name = request.getParameter("name");
            String email = (String)session.getAttribute("email");
            String password = request.getParameter("password");
            String phone = request.getParameter("phone");
            
            Staff staff = db.findStaffbyEmail(email);
            
            session.setAttribute("name", staff.getStaffFullName());
            session.setAttribute("email", staff.getStaffEmail());
            session.setAttribute("password", staff.getStaffPwd());
            session.setAttribute("phone", staff.getStaffMobNo());
            
            db.updateStaff(name, email, password, phone);
            response.sendRedirect("/lotBay/CustomerAccount/StaffSave.jsp");
            connector.closeConnection();
        
    } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(CustUpdateAcct.class.getName()).log(Level.SEVERE, null, ex);
}
 }
}
