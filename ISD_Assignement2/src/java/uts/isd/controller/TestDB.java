package uts.isd.controller;


import uts.isd.model.Customer;
import uts.isd.model.Student;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

import java.sql.*;

import java.util.*;

import java.util.logging.*;


public class TestDB {

    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        try {

            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);

            // 查
            Student songwen = db.findStudent("songwen-1@163.com", "233450");
            System.out.println(songwen);

            Student bob = db.findStudent("bob-1@163.com");
            System.out.println(bob);

            Customer test = db.findCustomer("test@.com");
            System.out.println(test);

            Customer curry5 = db.findCustomer("curry5@.com");
            System.out.println(curry5);
            // 增
            //db.addCustomer("Jingsong@163.com", "110", "Jingsong" ,"2001-01-02");
            // System.out.println("Successfully Add Data");

            // 删
            //db.deleteCustomer("Qingyun@163.com");

            // 改
            //db.updateCustomer("Jingsong@163.com", "suasua", "Jingsong Pang", "2001-01-02");
            // System.out.println("Successfully Update Data");
            connector.closeConnection();


        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}