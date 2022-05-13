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
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

/**
 *
 * @author QAQ
 */
@WebServlet(name = "UpdateStaServlet", urlPatterns = {"/UpdateStaServlet"})
public class UpdateStaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       String shipmentID = request.getParameter("shipmentID");
            String Status = request.getParameter("Status");



        try {

            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);

            
            boolean Y = true;
            boolean N = false;
            //当前系统时间
            if (Status.equalsIgnoreCase("true")) {

               
                db.updateStatus(shipmentID,Y);
                response.sendRedirect("/ISD_Assignement2/ShipmentsPage/ShipmentInfo.jsp");
            } 
            else if(Status.equalsIgnoreCase("false")){
                
              db.updateStatus(shipmentID,N);
              response.sendRedirect("/ISD_Assignement2/ShipmentsPage/ShipmentInfo.jsp");
            }
                    /* else if (Integer.parseInt(queryDate) == Integer.parseInt(date)) {
                System.out.println("从数据库中取出的时间等于当前系统时间！");

            }*/ else{
                // 从数据库中取出的时间大于当前系统时间！
                // out.println("The time taken from the database is greater than the current system time!");
                response.sendRedirect("/ISD_Assignement2/ShipmentsPage/ShipmentError.jsp");
            }
            
            connector.closeConnection();
        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}