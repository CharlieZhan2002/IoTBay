package uts.isd.model.dao;

import java.sql.*;
import uts.isd.model.User;
import uts.isd.model.Product;
import uts.isd.model.Customer;
import uts.isd.model.Student;
/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
*/

public class DBManager {

private Statement st;
   
public DBManager(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}

//Find user by id  
public User findUser(String id) throws SQLException {       
   String fetch = "SELECT * FROM ROOT.USERS WHERE USERID = '"+ id +"'";  
   ResultSet rs = st.executeQuery(fetch); 

   while(rs.next()){
       String userid = rs.getString(8);
       if(userid .equals(id)){
           String firstname = rs.getString(1);
           String lastname = rs.getString(2);
           String email = rs.getString(3);
           String gender = rs.getString(4);
           String dob = rs.getString(5);
           String password = rs.getString(6);
           String type = rs.getString(7);
           return new User(firstname, lastname,email,gender,dob,password,type,userid);
       }
   }
   return null;   
}
//Add a user-data into the database   
public void addUser(String FirstName, String LastName, String Email, String Gender, String DoB, String Password, String Type, String UserId) throws SQLException {                   //code for add-operation       
  st.executeUpdate("INSERT INTO ROOT.USERS VALUES('"+ FirstName +" ','"+ LastName +" ','"+ Email +" ','"+ Gender +"','"+ DoB +" ','"+ Password +"','"+ Type +"','"+ UserId +"')");   
  //st.executeUpdate("INSERT INTO ROOT.TEST VALUES('name1','password1')");  
}

//update a user details in the database   
public void updateUser(String FirstName, String LastName, String Email, String Gender, String DoB, String Password, String Type, String UserId) throws SQLException {       
   //code for update-operation   
   st.executeUpdate("UPDATE ROOT.USERS SET FIRSTNAME='" + FirstName + "',LASTNAME='"+ LastName +"',EMAIL='"+ Email +"',GENDER='"+ Gender +"',DOB='"+ DoB +"',PASSWORD='"+ Password +"',TYPE='"+ Type +"',USERID='"+ UserId +"'WHERE USERID='"+ UserId +"'"); 
}       

//delete a user from the database   
public void deleteUser(String UserId) throws SQLException{       
   //code for delete-operation   
   st.executeUpdate("DELETE FROM ROOT.USERS WHERE USERID='" + UserId + "'"); 
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
 









//Find user by email and password in the database
    public Student findStudent(String email, String password) throws SQLException {
        //setup the select sql query string
        String fetch = "select * from ROOT.students where Email = '" + email + "' and password='" + password + "'";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            String studentEmail = rs.getString(2);
            String studentPass = rs.getString(3);
            if (studentEmail.equals(email) && studentPass.equals(password)) {
                String studentName = rs.getString(1);
                String studentDob = rs.getString(4);
                return new Student(studentName, studentEmail, password, studentDob);
            }
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return null;
    }

    public Student findStudent(String email) throws SQLException {
        String fetch = "select * from ROOT.students where Email = '" + email + "'";
        ResultSet rs = st.executeQuery(fetch);
        while (rs.next()) {
            String studentEmail = rs.getString(2);
            String studentPass = rs.getString(3);
            String studentDob = rs.getString(4);
            if (studentEmail.equals(email)) {
                String studentName = rs.getString(1);
                return new Student(studentName, studentEmail, studentPass, studentDob);
            }
        }
        return null;
    }

    public Customer findCustomer(String customerEmail) throws SQLException {
        String fetch = "select * from ROOT.Customer where Email = '" + customerEmail + "'";
        ResultSet rs = st.executeQuery(fetch);
        while (rs.next()) {
            String email = rs.getString(1);
            String userPassword = rs.getString(2);
            String fullName = rs.getString(3);
            String dateOfBirth = rs.getString(4);
            if (email.trim().equals(customerEmail.trim())) { // 有时候前后有空格可以忽略
                return new Customer(email, userPassword, fullName, dateOfBirth);
            }
        }
        return null;
    }

    public Customer findCustomer(String email, String password) throws SQLException {
        //setup the select sql query string
        String fetch = "select * from ROOT.Customer where EMAIL = '" + email + "' and USERPASSWORD='" + password + "'";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            String customerEmail = rs.getString(1);
            String userPassword = rs.getString(2);
            if (customerEmail.trim().equals(email.trim()) && userPassword.trim().equals(password.trim())) { // 有时候前后有空格可以忽略
                String fullName = rs.getString(3);
                String dateOfBirth = rs.getString(4);
                return new Customer(customerEmail, userPassword, fullName, dateOfBirth);
            }
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return null;
    }




    //Add a user-data into the database
    public void addUser(String email, String name, String password, String gender, String favcol) throws SQLException {
        //code for add-operation
        // st.executeUpdate("INSERT INTO ROOT.USERS VALUES('" + FirstName + " ','" + LastName + " ','" + Email + " ','" + Gender + "','" + DoB + " ','" + Password + "','" + Type + "','" + UserId + "')");
        st.executeUpdate("sql query");

    }

    public void addCustomer(String email, String userPassword, String fullName, String dateOfBirth) throws SQLException {
        //code for add-operation
        st.executeUpdate("INSERT INTO ROOT.Customer VALUES('" + email + " ','" + userPassword + " ','" + fullName + " ','" + dateOfBirth + "')");
        // st.executeUpdate("sql query");

    }

    public void updateCustomer(String email, String userPassword, String fullName, String dateOfBirth) throws SQLException {
        //code for add-operation
        st.executeUpdate("UPDATE ROOT.Customer SET EMAIL='" + email + "',USERPASSWORD='" + userPassword + "',FULLNAME='" + fullName + "',DATEOFBIRTH='" + dateOfBirth + "'WHERE EMAIL='" + email + "'");
        // st.executeUpdate("sql query");

    }

    public void deleteCustomer(String email) throws SQLException {
        //code for delete-operation
        st.executeUpdate("DELETE FROM ROOT.Customer WHERE EMAIL='" + email + "'");
    }


}