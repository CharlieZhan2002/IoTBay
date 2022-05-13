/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.isd.controller;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import uts.isd.model.dao.*;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.Shipment;
/**
 *
 * @author QAQ
 */
public class ShipmentController {

public static void main(String[] args) {
    try {
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        //db.getProducts();
        //db.addProducts("2","aa","no","2","4");
        //addprodata("3","aa","no","2","4");
        connector.closeConnection();
    }catch(ClassNotFoundException | SQLException ex) 
    {
         Logger.getLogger(ShipmentController.class.getName()).log(Level.SEVERE, null, ex);
     }

}
//public Shipment[] getSdata() throws ClassNotFoundException, SQLException{
//        DBConnector connector = new DBConnector();
//        Connection conn = connector.openConnection();
//        DBManager db = new DBManager(conn);
//
//        Shipment [] res = new Shipment[db.getShipment().length];
//        res = db.getShipment();
//  
//        connector.closeConnection();
//        return res;
//    }

public static void addShipment(String orderID,String Details,String ETA,boolean Status) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.addShipment(orderID,Details,ETA,Status);
    
        connector.closeConnection();
    }

public static void deleteShipment(String shipmentID) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.deleteShipment(shipmentID);
    
        connector.closeConnection();
    }

public static void updateShipment(String shipmentID,String Details) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.updateShipment(shipmentID,Details);
    
        connector.closeConnection();
    }

public static void findShipment(String shipmentID) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.findShipment(shipmentID);
    
        connector.closeConnection();
    }

public static void updateStatus(String shipmentID,boolean Status) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.updateStatus(shipmentID,Status);
    
        connector.closeConnection();
    }
}
