package uts.isd.model.dao;

import java.sql.*;
import uts.isd.model.User;
import uts.isd.model.Product;
import uts.isd.model.Staff;
import uts.isd.model.Customer;
import java.util.ArrayList;
/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
*/

public class DBManager {

private Statement st;
   
public DBManager(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}

//-------------------Customer database ------------------------------
//Find Customer by Email and Password   
public Customer findCustbyEmail(String CustEmail) throws SQLException {       
   String fetch = "SELECT * FROM ROOT.CUSTOMERS WHERE CUSTEMAIL = '"+ CustEmail + "'";  
   ResultSet rs = st.executeQuery(fetch); 

   while(rs.next()){
          String CEmail = rs.getString(2);
          String CPwd = rs.getString(3);
          String CFullName = rs.getString(1);
          String CMobNo = rs.getString(6);
       if(CEmail .equalsIgnoreCase(CustEmail)){
           return new Customer(CEmail,CPwd,CFullName,CMobNo);
       }
   }
   return null;   
}
public Customer findCustomer(String CustEmail, String CustPwd) throws SQLException {       
   String fetch = "SELECT * FROM ROOT.CUSTOMERS WHERE CUSTEMAIL = '"+ CustEmail + "' and CUSTPWD= '" + CustPwd +"'";  
   ResultSet rs = st.executeQuery(fetch); 

   while(rs.next()){
          String CEmail = rs.getString(2);
          String CPwd = rs.getString(3);
          if(CEmail .equalsIgnoreCase(CustEmail) && CPwd.equals(CustPwd)){
          String CFullName = rs.getString(1);
          String CMobNo = rs.getString(6);
       
           return new Customer(CEmail,CPwd,CFullName,CMobNo);
       }
   }
   return null;   
}
//Add a customer-data into the database   
public void addCustomer(String CustFullName, String CustEmail, String CustPwd, String CustShippingAddr, String CustAccess, String CustMobNo) throws SQLException {                   //code for add-operation       
  st.executeUpdate("INSERT INTO ROOT.CUSTOMERS VALUES('"+ CustFullName +" ','"+ CustEmail +" ','"+ CustPwd +"', '"+ CustShippingAddr +"' , '" + CustAccess +"', '"+ CustMobNo +"')");   
  //st.executeUpdate("INSERT INTO ROOT.TEST VALUES('name1','password1')");  
}

//update a customer details in the database   
public void updateCustName(String CustFullName , String CustEmail) throws SQLException {       
   //code for update-operation   
   st.executeUpdate("UPDATE ROOT.CUSTOMERS SET CUSTFULLNAME='" + CustFullName + "' WHERE CUSTEMAIL='"+ CustEmail +"'"); 
} 

public void updateCustEmail(String newCustEmail, String CustEmail) throws SQLException {
    st.executeUpdate("UPDATE ROOT.CUSTOMERS SET CUSTEMAIL='" + newCustEmail + "' WHERE CUSTEMAIL='" + CustEmail + "'");    
}

public void updateCustPwd(String CustPwd, String CustEmail) throws SQLException {
    st.executeUpdate("UPDATE ROOT.CUSTOMERS SET CUSTPWD='" + CustPwd + "' WHERE CUSTEMAIL='" + CustEmail + "'");    
}

public void updateCustShippingAdd(String CustShippingAdd, String CustEmail) throws SQLException {
    st.executeUpdate("UPDATE ROOT.CUSTOMERS SET CUSTSHIPPINGADD='" + CustShippingAdd + "' WHERE CUSTEMAIL='" + CustEmail + "'");    
}

public void updateCustMobNo(String CustMobNo, String CustEmail) throws SQLException {
    st.executeUpdate("UPDATE ROOT.CUSTOMERS SET CUSTMOBNO='" + CustMobNo+ "' WHERE CUSTEMAIL='" + CustEmail + "'");   
}
//delete a customer from the database   
public void deleteCust(String CustEmail) throws SQLException{       
   //code for delete-operation   
   st.executeUpdate("DELETE FROM ROOT.CUSTOMERS WHERE CUSTEMAIL='" + CustEmail + "'"); 
}

public boolean checkCustEmail (String CustEmail) throws SQLException {
    boolean check = false;
    String fetch = "SELECT * FROM ROOT.CUSTOMERS WHERE CUSTEMAIL = '" + CustEmail +"'";
    ResultSet rs = st.executeQuery(fetch);
    while (rs.next()){
        String checkEmail = rs.getString(2);
        if(checkEmail != null){
            check = true;
            break;
        }
    }
    return check;
}

//fetch customers from customer database
public ArrayList<Customer> fetchCustomers()throws SQLException{
    String fetch = "SELECT * from ROOT.CUSTOMERS";
    ResultSet rs = st.executeQuery(fetch);
    ArrayList<Customer> cust = new ArrayList();
    while (rs.next()){
        
          String CFullName = rs.getString(1);
          String CEmail = rs.getString(2);
          String CPwd = rs.getString(3);
          String CShipping = rs.getString(4);
          String CAccess = rs.getString(5);
          String CMobNo = rs.getString(6);
   
          cust.add(new Customer(CFullName, CEmail, CPwd, CShipping, CAccess, CMobNo));
    }
    return cust;
}

// -------------------Staff-------------------------
public boolean checkStaffByEmail(String StaffEmail) throws SQLException{
    boolean isStaff = false;
    String fetch = "SELECT * FROM ROOT.STAFF WHERE STAFFEMAIL = '" + StaffEmail +"'";
    ResultSet rs = st.executeQuery(fetch);
    while (rs.next()){
        String staffCheck = rs.getString(2);
        if(staffCheck != null){
            isStaff = true;
            break;
        }
    }
    return isStaff;
}

public String checkAccess(String StaffEmail) throws SQLException{
    String fetch = "SELECT STAFFACCESS FROM ROOT.STAFF WHERE STAFFEMAIL = '" + StaffEmail +"'";
    ResultSet rs = st.executeQuery(fetch);
    
    String SAccess = rs.getString(4);
    
    return SAccess; 
}
      
public Staff findStaff(String StaffEmail, String StaffPwd) throws SQLException {       
   String fetch = "SELECT * FROM ROOT.STAFF WHERE STAFFEMAIL = '"+ StaffEmail + "' AND STAFFPWD = '" + StaffPwd +"'";  
   ResultSet rs = st.executeQuery(fetch); 

   while(rs.next()){
       String SEmail = rs.getString(2);
       String SPwd = rs.getString(3);
       if(SEmail .equalsIgnoreCase(StaffEmail) && SPwd.equals(StaffPwd)){
          String SFullName = rs.getString(1);
          String SMobNo = rs.getString(5);
          
           return new Staff(SFullName, SEmail, SPwd, SMobNo);
       }
   }
   return null;   
}
//Add a customer-data into the database   
public void addStaff(String StaffFullName, String StaffEmail, String StaffPwd, String StaffAccess, String StaffMobNo) throws SQLException {                   //code for add-operation       
  st.executeUpdate("INSERT INTO ROOT.CUSTOMERS VALUES('"+ StaffFullName +" ','"+ StaffEmail +" ','"+ StaffPwd +"', '" + StaffAccess + "', '"+ StaffMobNo +"')");   
  //st.executeUpdate("INSERT INTO ROOT.TEST VALUES('name1','password1')");  
}

//update a customer details in the database   
public void updateStaffName(String StaffFullName, String StaffEmail ) throws SQLException {       
   //code for update-operation   
   st.executeUpdate("UPDATE ROOT.STAFF SET STAFFFULLNAME='" + StaffFullName + "' WHERE STAFFEMAIL='"+ StaffEmail +"'"); 
} 

public void updateStaffEmail(String newStaffEmail, String StaffEmail) throws SQLException {
    st.executeUpdate("UPDATE ROOT.STAFF SET STAFFEMAIL='" + newStaffEmail + "' WHERE STAFFEMAIL='" + StaffEmail + "'");    
}

public void updateStaffPwd(String StaffPwd, String StaffEmail ) throws SQLException {
    st.executeUpdate("UPDATE ROOT.STAFF SET STAFFPWD='" + StaffPwd + "' WHERE STAFFEMAIL='" + StaffEmail + "'");    
}


public void updateStaffMobNo(String StaffMobNo, String StaffEmail) throws SQLException {
    st.executeUpdate("UPDATE ROOT.STAFF SET STAFFMOBNO='" + StaffMobNo+ "' WHERE STAFFEMAIL='" + StaffEmail + "'");   
}
//delete a customer from the database   
public void deleteStaff(String StaffEmail) throws SQLException{       
   //code for delete-operation   
   st.executeUpdate("DELETE FROM ROOT.STAFF WHERE STAFFEMAIL='" + StaffEmail + "'"); 
}

//fetch customers from customer database
public ArrayList<Staff> fetchStaff()throws SQLException{
    String fetch = "SELECT * from ROOT.STAFF";
    ResultSet rs = st.executeQuery(fetch);
    ArrayList<Staff> temp = new ArrayList();
    while (rs.next()){
          String SEmail = rs.getString(3);
          String SPwd = rs.getString(4);
          String SID = rs.getString(1);
          String SFullName = rs.getString(2);
          String SMobNo = rs.getString(6);
   
          temp.add(new Staff(SID, SFullName, SEmail, SPwd, SMobNo));
    }
    return temp;
}



public Product findProducts(String id) throws SQLException {       
   String fetch = "SELECT * FROM ROOT.PRODUCT WHERE PID = '"+ id +"'";  
   ResultSet rs = st.executeQuery(fetch); 
   
   while(rs.next()){
       String userid = rs.getString(1).replaceAll(" ","");
       if(userid.equals(id)){
           String pname = rs.getString(2);
           String ptype = rs.getString(3);
           String price = rs.getString(4);
           String quantity = rs.getString(5);
           return new Product(userid, pname,ptype,price,quantity);
       }
   }
   return null;   
}
//Find user by id  
public Product[] getProducts() throws SQLException {   
   String fetch = "SELECT * FROM ROOT.PRODUCT";  
   ResultSet rs = st.executeQuery(fetch);
   //int count = 0;
   //while(rs2.next()){count++;}
   Product [] res = new Product[100];
   int i = 0;
   while(rs.next()){
       res[i] = new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
       i++;
   }
   i=0;
   System.out.println(res[0].getPname());
   return res;   
}

public void addProducts(String pid, String pname, String type, String price, String quantity) throws SQLException {                   //code for add-operation       
  st.executeUpdate("INSERT INTO ROOT.PRODUCT VALUES('"+ pid +" ','"+ pname +" ','"+ type +" ','"+ price +"','"+ quantity +"')");   
}
 
public void deleteProducts(String pid) throws SQLException{       
   //code for delete-operation   
   st.executeUpdate("DELETE FROM ROOT.PRODUCT WHERE PID='" + pid + "'"); 
}

public void updateProducts(String pid, String pname, String type, String price, String quantity) throws SQLException {       
   //code for update-operation   
   st.executeUpdate("UPDATE ROOT.PRODUCT SET PID='" + pid + "',PNAME='"+ pname +"',TYPE='"+ type +"',PRICE='"+ price +"',QUANTITY='"+ quantity +"'WHERE PID='"+ pid +"'"); 
}   

}