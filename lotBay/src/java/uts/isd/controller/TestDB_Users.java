
package uts.isd.controller;

 

import java.sql.*;

import java.util.*;
import java.util.logging.*;
import uts.isd.model.dao.*;
import uts.isd.model.Customer;
import uts.isd.model.Staff;
 

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
//db.addCustomer("test", "test@gmail.com","1234"," ","","0456789012");
//db.addCustomer(CustFullName, CustEmail, CustPwd, CustShippingAddr, CustAccess, CustMobNo);
//db.updateCustEmail("vox@gmail.com", "Vox@email.com");
//db.updateCustName("testing","test@gmail.com");
//db.updateCustMobNo("0478678678", "test@gmail.com");
//db.updateCustPwd("1212", "test@gmail.com");
//db.updateCustShippingAdd("Australia", "test@gmail.com");
//db.deleteCust("test@email.com");
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
//boolean c = db.checkStaffByEmail("sammi@email.com");
//System.out.println("Result is = " + c);
//db.addCustomer("Miko","Miko@email.com", "1234", "Australia", "1", "0456356256");
// db.addStaff("Sam", "sam@email.com", "1234", "4", "0453245635");
 
 Staff staff = db.findStaff("sam@email.com", "1234");
 System.out.println(staff);

//Customer customer = db.findCustbyEmail("sammi@email.com");
//System.out.println(customer);
//connector.closeConnection();

 

} catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestDB_Users.class.getName()).log(Level.SEVERE, null, ex);

}

}

}