
package uts.isd.controller;

 

import java.sql.*;

import java.util.*;
import java.util.logging.*;
import uts.isd.model.dao.*;
import uts.isd.model.Customer;
 

public class TestDB_Users {

private static Scanner in = new Scanner(System.in);

public static void main(String[] args) {

try {

DBConnector connector = new DBConnector();

Connection conn = connector.openConnection();

DBManager db = new DBManager(conn);

//db.addCustomer("Vox", "Vox@email.com", "1234", "12 World", "1", "0401000000");
//db.addCustomer("Nina", "Ninaurr@email.com", "2232", " ", " ", "0432000000");
//db.addCustomer("Etta", "Etta@email.com", "1111","","","0411000000");
/*System.out.print("firstname: ");
String firstname = in.nextLine();

System.out.print("lastname: ");
String lastname = in.nextLine();

System.out.print("userid: ");
String userid = in.nextLine();

System.out.print("email: ");
String email = in.nextLine();

System.out.print("gender: ");
String gender = in.nextLine();

System.out.print("dob: ");
String dob = in.nextLine();

System.out.print("password: ");
String password = in.nextLine();

System.out.print("type: ");
String type = in.nextLine();

//db.addUser( firstname, lastname,email,gender,dob,password,type,userid);
//System.out.println(db.findUser("1").getFirstName());
System.out.println("test item is added to the database.");*/

connector.closeConnection();

 

} catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestDB_Users.class.getName()).log(Level.SEVERE, null, ex);

}

}

}