package uts.isd.controller;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import uts.isd.model.dao.*;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.Product;

public class GetProductController {

public static void main(String[] args) {
    try {
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);
        
        //System.out.print(findpdata("2").getPname());
        //deletepdata("1");
        //updatepdata("2","aa","no","2","4");
        //addprodata("3","aa","no","2","4");

        connector.closeConnection();
    }catch(ClassNotFoundException | SQLException ex) 
    {
         Logger.getLogger(GetProductController.class.getName()).log(Level.SEVERE, null, ex);
     }

}

public static Product findpdata(String pid) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        Product res = db.findProducts(pid);
  
        connector.closeConnection();
        return res;
    }
public Product[] getpdata() throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        Product [] res = new Product[db.getProducts().length];
        res = db.getProducts();
  
        connector.closeConnection();
        return res;
    }

public static void addpdata(String pid, String pname, String type, String price, String quantity) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.addProducts(pid,pname,type,price,quantity);
    
        connector.closeConnection();
    }

public static void deletepdata(String pid) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.deleteProducts(pid);
    
        connector.closeConnection();
    }

public static void updatepdata(String pid, String pname, String type, String price, String quantity) throws ClassNotFoundException, SQLException{
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBManager db = new DBManager(conn);

        db.updateProducts(pid,pname,type,price,quantity);
    
        connector.closeConnection();
    }

}


