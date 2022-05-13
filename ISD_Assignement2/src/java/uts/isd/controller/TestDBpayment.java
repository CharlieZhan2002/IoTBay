/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uts.isd.controller;

 

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import uts.isd.model.PAYMENT;
import uts.isd.model.dao.*;

 

public class TestDBpayment {

private static Scanner in = new Scanner(System.in);
private DBConnector connector;
private Connection conn;
private DBManager db;

public static void main(String[ ] args)  throws SQLException {
          (new TestDBpayment()).runQueries();
}


public TestDBpayment()  {
try {

 connector = new DBConnector();

 conn = connector.openConnection();

 db = new DBManager(conn);
} catch (ClassNotFoundException | SQLException ex)  {
        Logger.getLogger(TestDBpayment.class.getName()).log(Level.SEVERE, null,ex);
}
}



private char readChoice() {
System.out.print("Operation CRUDS or * to exit: ");
return in.nextLine().charAt(0);
}

 private void  runQueries() throws SQLException {
      char c;
      while ((c = readChoice())!='*') {
switch(c) {
case 'C':
testAdd();
break;
case'R':;
testRead();
break;
case'U':;
testUpdate();
break;
case'D':;
testDelete();
case'S':;
showAll();
break;
default:
System.out.println("Unknown Command");
break;
}
}
}



private void testAdd() {
System.out.print("Order ID: ");
Integer orderID = in.nextInt();
in.nextLine();
System.out.print("Payment method: ");
String paymentMethod = in.nextLine();
System.out.print("Card Name: ");
String cardName = in.nextLine();
System.out.print("Card BSB: ");
String cardBSB = in.nextLine();
System.out.print("Card Number: ");
String cardNumber= in.nextLine();
System.out.print("Card expired Date: ");
String expireDate  = in.nextLine();
System.out.print("Total price: ");
String totalPrice  = in.nextLine();
System.out.print("Payment date: ");
String paymentDate = in.nextLine();

try {
db.addPayment(orderID,paymentMethod, cardName, cardBSB, cardNumber, expireDate, totalPrice,paymentDate) ;
} 
catch (SQLException ex) {
Logger.getLogger(TestDBpayment.class.getName()).log(Level.SEVERE,null,ex);
}
System.out.println("Payment details are added to the database. ");
}

private void testRead( ) throws SQLException {
System.out.print("Payment ID: ");
Integer paymentID = in.nextInt();
in.nextLine();
System.out.print("Payment Date: ");
String paymentDate = in.nextLine();
//Integer paymentID = 1006;        //debug code
//String paymentDate = "03-03-2013";      //debug code
PAYMENT payment = db.findPayment(paymentID,paymentDate);

if (payment != null) {
System.out.println("Payment Details with Card Number  " +payment.getCardNumber()+  " and total price  "+payment.getTotalPrice()+"  exists in the database. ");
}else{
    System.out.println("payment detail does not exist. ");
}
//System.out.printf("%d",paymentID);   //debug code
//System.out.printf("%s",paymentDate);  //debug code
}

private void testUpdate()   {
System.out.print("Payment ID: ");
Integer paymentID=in.nextInt();
in.nextLine();
System.out.print("Payment Date: ");
String paymentDate= in.nextLine();
     try{
if(db.checkPayment(paymentID,paymentDate))  {
System.out.print("Payment method: ");
String paymentMethod  = in.nextLine();
System.out.print("Card Name: ");
String cardName  = in.nextLine();
System.out.print("Card BSB: ");
String cardBSB  = in.nextLine();
System.out.print("Card Number: ");
String cardNumber  = in.nextLine();
System.out.print("Card expired Date: ");
String expireDate =   in.nextLine();
System.out.print("Total Price: ");
String totalPrice  = in.nextLine();
db.updatePayment(paymentMethod, cardName, cardBSB, cardNumber, expireDate, totalPrice, paymentDate,paymentID);
}else{
System.out.println("Payment detail does not exist. ");
}
}catch (SQLException ex) {
Logger.getLogger(TestDBpayment.class.getName()).log(Level.SEVERE,null,ex);
}
}

private void testDelete() {
System.out.print("Payment ID: ");
Integer paymentID =in.nextInt();
in.nextLine();
System.out.print("Payment Date: ");
String paymentDate= in.nextLine();


try {
 if (db.checkPayment(paymentID,paymentDate)) {
db.deletePayment(paymentID);
}else {
System.out.print("Payment detail does not exist");
}
}catch(SQLException ex) {
Logger.getLogger(TestDBpayment.class.getName()).log(Level.SEVERE,null,ex);
}
}


private void showAll()  {
try {
ArrayList<PAYMENT> payments = db.fectPayments();
System.out.println("PAYMENT TABLE:  ");
payments.stream().forEach((payment)-> {
      System.out.printf("%-20s %-30s %-20s %-10s %-20s %-20s %-10s \n",payment.getPaymentMethod(),payment.getCardName(),payment.getCardBSB(),payment.getCardNumber(),payment.getExpireDate(),payment.getTotalPrice(),payment.getPaymentDate());

});
System.out.println();
}catch(SQLException ex)  {
Logger.getLogger(TestDBpayment.class.getName()).log(Level.SEVERE,null,ex);
}
}
}
