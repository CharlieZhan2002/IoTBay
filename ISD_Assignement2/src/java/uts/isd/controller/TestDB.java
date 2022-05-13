package uts.isd.controller;


import uts.isd.model.Customer;
import uts.isd.model.Order;
import uts.isd.model.Staff;
import uts.isd.model.Student;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

import java.sql.*;
import java.text.SimpleDateFormat;

import java.util.*;

import java.util.logging.*;
import uts.isd.model.Product;
import java.util.Date;
import uts.isd.model.Orderline;

public class TestDB {

    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        try {

            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);

            Orderline orderline = db.findOrderline(100075);    
            Order order = db.findOrder(100087);
            System.out.println(order);

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}