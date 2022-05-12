/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ettas
 */
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
        session.removeAttribute("custEmail");

        response.sendRedirect("index page/index.jsp");
        System.out.println("user logged out");

    }

}

