/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author QAQ
 */
@WebServlet(name = "SearchShipmentServlet", urlPatterns = {"/SearchShipmentServlet"})
public class SearchShipmentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String shipmentID = request.getParameter("shipmentID");
        HttpSession session = request.getSession();
        session.setAttribute("shipmentID", shipmentID);
           response.sendRedirect("/ISD_Assignement2/ShipmentsPage/Shipmentfind.jsp");
        }
    }



