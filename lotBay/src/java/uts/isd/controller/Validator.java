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
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ettas
 */
public class Validator implements Serializable{ 
    private String emailPattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";      
    private String namePattern = "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*$";       
    private String passwordPattern = "[a-z0-9A-Z]{4,}"; 
    private String phonePattern = "([0]{1}[4]{1}[0-9]{8})*";

    public Validator(){    }       


    public boolean validate(String pattern, String input){       
       Pattern regEx = Pattern.compile(pattern);       
       Matcher match = regEx.matcher(input);       
       return match.matches(); 
    }
    
    public boolean checkEmpty (String email, String password){
        return email.isEmpty() || password.isEmpty();
    }
    
    public boolean ValidateEmail (String email){
        return validate(emailPattern, email);
    }
    
    public boolean ValidateName (String name){
        return validate (namePattern, name);
    }
    
    public boolean ValidatePassword (String password){
        return validate (passwordPattern, password);
    }
    
    public boolean ValidatePhone (String phone){
        return validate (phonePattern, phone);
    }
    
    public void clear(HttpSession session){
        // set error attributes to show to user
        // reset validation messages after every event submission
        session.setAttribute("emailErr", "Enter email");
        session.setAttribute("passErr", "Enter password");
        session.setAttribute("existErr", "");
        session.setAttribute("nameErr", "Enter name");
        session.setAttribute("phoneErr", "Enter phone");
    }
}