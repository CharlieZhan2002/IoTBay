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
 * @author huasongwen
 */
@WebServlet(name = "SearchAdminOrderServlet", urlPatterns = {"/SearchAdminOrderServlet"})
public class SearchAdminOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String orderId = request.getParameter("inputValue");
        HttpSession session = request.getSession();
        session.setAttribute("orderId", orderId);
        response.sendRedirect("/ISD_Assignement2/CustomerInfo/AdminOrderSearch.jsp");


    }


}
