package uts.isd.controller;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import uts.isd.model.dao.*;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.PAYMENT;

public class GetPaymentController {

public static void main(String[] args) throws ClassNotFoundException {
    try {
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        //deletepdata("1");
        //updatepdata("2","aa","no","2","4");
        //addprodata("3","aa","no","2","4");

        connector.closeConnection();
    }catch(SQLException ex) 
    {
         Logger.getLogger(GetPaymentController.class.getName()).log(Level.SEVERE, null, ex);
     }

}
public PAYMENT[] getPayments() throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        PAYMENT [] res = new  PAYMENT[db.getPayments().length];
        res = db.getPayments();
  
        connector.closeConnection();
        return res;
    }

public static void addPayment(Integer orderID,String paymentMethod,String cardName,String cardBSB,String cardNumber,String expireDate,String totalPrice,String paymentDate) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.addPayment(orderID,paymentMethod, cardName, cardBSB, cardNumber, expireDate, totalPrice,paymentDate) ;
    
        connector.closeConnection();
    }

public static void deletePayment(Integer paymentID) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.deletePayment(paymentID);
    
        connector.closeConnection();
    }

public static void updatePayment(String paymentMethod,String cardName,String cardBSB,String cardNumber,String expireDate,String totalPrice,String paymentDate,Integer paymentID) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.updatePayment(paymentMethod, cardName, cardBSB, cardNumber, expireDate, totalPrice, paymentDate,paymentID);
    
        connector.closeConnection();
    }

}


