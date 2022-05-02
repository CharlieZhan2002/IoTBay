/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package uts.isd.controller;

import uts.isd.model.Customer;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

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

/**
 *
 * @author huasongwen
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/LogoutServlet"})
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // work in do post method
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // accept username and password from index.html file
        // String password = request.getParameter("password");
        HttpSession session = request.getSession();
        session.removeAttribute("login_email");
        response.sendRedirect("/ISD_Assignement2/index page/index.jsp");
        // out.println(email);


    }

}
