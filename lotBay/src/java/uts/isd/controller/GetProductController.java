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

        //db.getProducts();
        //db.addProducts("2","aa","no","2","4");
        //addprodata("3","aa","no","2","4");

        connector.closeConnection();
    }catch(ClassNotFoundException | SQLException ex) 
    {
         Logger.getLogger(GetProductController.class.getName()).log(Level.SEVERE, null, ex);
     }

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
}


